package fr.jcgay.maven.profiler.template;

import com.google.common.base.Stopwatch;
import org.apache.maven.plugin.MojoExecution;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private final String name;
    private final Stopwatch time;
    private final List<EntryAndTime<MojoExecution>> mojosWithTime = new ArrayList<EntryAndTime<MojoExecution>>();

    public Project(String name, Stopwatch time) {
        this.name = name;
        this.time = time;
    }

    public void addMojoTime(EntryAndTime<MojoExecution> mojoWithTime) {
        mojosWithTime.add(mojoWithTime);
    }

    public String getName() {
        return name;
    }

    public List<EntryAndTime<MojoExecution>> getMojosWithTime() {
        return mojosWithTime;
    }

    public Stopwatch getTime() {
        return time;
    }
}
