package com.allsrc.monstertrucks;

import com.badlogic.gdx.math.Vector3;

public class LevelObject {
    public static String name;
    public Vector3 pos;
    public int rot;

    public LevelObject() {}

    public void update() {
        // update
    }

    public String getSaveLine() {
        return name + "," + pos.x + "," + pos.y + "," + pos.z;
    }
}