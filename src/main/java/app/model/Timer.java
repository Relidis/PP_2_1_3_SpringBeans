package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();
    @Autowired
    public Long getTime() {
        return nanoTime;
    }
}
