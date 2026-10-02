# Taliabu TV3 5.6.3 customization layer

Base source: FongMi/TV commit `2f88a0b878c116479851b7e0a0fe499b1e24b34d`.

## Product customizations

- App name: `塔岛电视3`
- Application ID: `com.taliabu.tv3`
- Default VOD source: `https://tvsource.taliabu.kdns.fr`
- Taliabu launcher icon, TV banner and splash icon
- Pure-black application background
- Built-in self-update disabled
- Remote APK installation disabled
- `REQUEST_INSTALL_PACKAGES` permission removed

## Public-build compatibility

FongMi 5.6.3 source references player AARs which are not committed to the upstream Git repository. The CI workflow restores a pinned public 5.6.3-era AAR snapshot and applies the files under `.github/public-build-compat/` only inside the CI workspace.

The compatibility layer is intentionally separated from the Taliabu product source. It exists only so the public repository can be built reproducibly. Remove it when matching official player AARs become available.

## Future sync rule

1. Start from a clean upstream source commit.
2. Reapply only the small Taliabu product commits.
3. Re-evaluate the public-build compatibility layer independently.
4. Build both Leanback and Mobile APKs before promoting a new version.
