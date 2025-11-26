# import requests
import json
from collections import defaultdict
import matplotlib.pyplot as plt

# ====== CONFIG ======
USERNAME = "Faruq-Hameed"
# Optional: put your GitHub Personal Access Token here for higher rate limits.
# If you don’t set this, the script will make unauthenticated requests (limit ~60/hr).  
GITHUB_TOKEN = None  # or "your_token_here"

# ====== FETCH REPOS ======
headers = {}
if GITHUB_TOKEN:
    headers["Authorization"] = f"token {GITHUB_TOKEN}"

repos_url = f"https://api.github.com/users/{USERNAME}/repos"
repos = requests.get(repos_url, headers=headers).json()

# ====== AGGREGATE LANGUAGES ======
language_totals = defaultdict(int)

for repo in repos:
    lang_url = repo.get("languages_url")
    if not lang_url:
        continue
    resp = requests.get(lang_url, headers=headers)
    if resp.status_code != 200:
        print(f"Failed to fetch for {repo['name']}: {resp.status_code}")
        continue
    langs = resp.json()
    for lang, count in langs.items():
        language_totals[lang] += count

# ====== PROCESS DATA ======
# Convert to lists for chart
languages = list(language_totals.keys())
sizes = list(language_totals.values())

# Sort by size (descending)
lang_size_pairs = sorted(language_totals.items(), key=lambda x: x[1], reverse=True)
languages_sorted = [p[0] for p in lang_size_pairs]
sizes_sorted = [p[1] for p in lang_size_pairs]

# ====== PLOT PIE CHART ======
plt.figure(figsize=(8, 8))
plt.pie(sizes_sorted, labels=languages_sorted, autopct="%1.1f%%", startangle=140)
plt.title(f"Top Languages for {USERNAME}")
plt.axis("equal")  # Equal aspect ratio ensures pie is drawn as a circle.
plt.show()

# ====== PLOT BAR CHART ======
plt.figure(figsize=(10, 6))
plt.bar(languages_sorted, sizes_sorted, color="skyblue")
plt.xlabel("Language")
plt.ylabel("Bytes of Code")
plt.title(f"Language Breakdown for {USERNAME}")
plt.xticks(rotation=45, ha="right")
plt.tight_layout()
plt.show()

# ====== PRINT TABLE ======
print("Language Breakdown (bytes):")
for lang, size in lang_size_pairs:
    print(f"{lang}: {size}")
