# Local development (owner only)

This file is only notes for working on the project locally. The showcase notice in `README.md` still applies.

## Requirements

- **JDK 21** (the project targets Java 21; Gradle will auto-detect it, e.g. `C:\Program Files\Eclipse Adoptium\jdk-21*`).
  If Gradle cannot find it, set `JAVA_HOME` to your JDK 21 folder before running commands.
- Minecraft Forge **1.21.1 / 52.1.0** (downloaded automatically by Gradle).
- IntelliJ IDEA (or another Gradle-compatible IDE).

## Commands (run in the project root)

| Command | What it does |
| --- | --- |
| `gradlew build` | Compiles the mod and creates `build\libs\orespawntest-1.0.0.jar` |
| `gradlew runClient` | Launches a Minecraft client with the mod installed |
| `gradlew runServer` | Launches a dedicated server with the mod installed |
| `gradlew runData` | Regenerates recipes/loot tables/models/tags into `src\generated\resources` |
| `gradlew clean build` | Full clean rebuild if something is stale |

On Windows use `gradlew.bat ...`; on Linux/macOS use `./gradlew ...`.

## IntelliJ setup

1. **File > Open...** and select this project folder (not a single file).
2. Let Gradle import; if asked, use the Gradle JVM / JDK 21.
3. If run configurations are missing, run `gradlew genIntellijRuns`, then refresh Gradle in IntelliJ.
4. Use the **runClient** configuration to launch the game.

## Where things live

- `src/main/java` — mod source code
- `src/main/resources` — textures, `mods.toml`, `pack.mcmeta`
- `src/generated/resources` — data-generator output (recipes, loot tables, models, tags); regenerate with `runData` instead of editing by hand
- `run/` — local dev game data (world, logs, configs); ignored by git
- `gradle.properties` — mod version/name and Minecraft/Forge versions

## Workflow

```powershell
gradlew clean build
gradlew runClient
git add .
git commit -m "describe your change"
git push
```
