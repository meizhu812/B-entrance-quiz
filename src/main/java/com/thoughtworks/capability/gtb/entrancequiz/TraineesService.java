package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class TraineesService {
    private final List<Trainee> trainees = new ArrayList<>();

    public TraineesService() {
        init(Arrays.asList(
                "成吉思汗",
                "鲁班七号",
                "太乙真人",
                "钟无艳",
                "花木兰",
                "雅典娜",
                "芈月",
                "白起",
                "刘禅",
                "庄周",
                "马超",
                "刘备",
                "哪吒",
                "大乔",
                "蔡文姬"
        ));
        System.out.println(findAll());
    }

    public List<Trainee> findAll() {
        return trainees;
    }

    public void init(List<String> traineeNames) {
        IntStream.range(0, traineeNames.size()).forEach(id -> trainees.add(new Trainee(id + 1, traineeNames.get(id))));
    }
}
