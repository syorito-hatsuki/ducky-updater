package dev.syoritohatsuki.duckyupdater.dto;

public class ProjectVersion {
    public String name;
    public String changelog;
    public String version_type;

    public String getName() {
        return name;
    }

    public String getChangelog() {
        return changelog;
    }

    public String getVersion_type() {
        return version_type;
    }
}