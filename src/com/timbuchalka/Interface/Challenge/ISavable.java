package com.timbuchalka.Interface.Challenge;

import java.util.ArrayList;
import java.util.List;

public abstract class ISavable {

    ArrayList<String> write();
    void read(ArrayList<String> savedValues);

    public abstract void read(List<String> savedValues);
}
