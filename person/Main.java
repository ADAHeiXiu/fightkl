package person;

import java.util.*;
/**
 * @author ADA
 * @version 2020-11-14
 */
public class Main {
    static String[] className = {"Chinese","Math","English"};
    public static void countAvg(Score[] scores){
        ArrayList<Score> scoreArrayList = new ArrayList<>(Arrays.asList(scores));
        int[] avg = {0,0,0};
        scoreArrayList.forEach(e->{
            if(e.getClassName().equals(className[0]))
                avg[0]+=e.getScore();
            else if(e.getClassName().equals(className[1]))
                avg[1]+=e.getScore();
            else avg[2]+=e.getScore();
        });
            for(int i=0;i<3;i++)
                avg[i]/=3;
            for(int i=0;i<3;i++)
                System.out.println(className[i]+"的平均分为:"+avg[i]);
    }

    private static List<Score> findClass(String checkName, Score[] scores) {
        ArrayList<Score> scoreArrayList = new ArrayList<>();
        for(Score a:scores){
            if(a.getClassName().equals(checkName))
                scoreArrayList.add(a);
        }
        return scoreArrayList;
    }

    private static List<Score> checkScore(int checkStudent, Score[] scores) {
        List<Score> scoreList = new ArrayList<>();
        for(Score a:scores){
            if(a.getNumber()==checkStudent)
                scoreList.add(a);
        }
        if(scoreList.isEmpty()) System.out.println("该学号不存在!");
        return scoreList;
    }
    public static void main(String[] args) {
//        Student[] students = {new Student(20200101,"张三","男",1),
//        new Student(20200102,"李四","男",1),
//        new Student(20200103,"王五","女",1)};

        Score[] scores = {
                new Score(20200101,className[0],100),
                new Score(20200101,className[1], 95),
                new Score(20200101,className[2],90),
                new Score(20200102,className[0],85),
                new Score(20200102,className[1],80),
                new Score(20200102,className[2],75),
                new Score(20200103,className[0],70),
                new Score(20200103,className[1],65),
                new Score(20200103,className[2],60)
        };
        countAvg(scores);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要查询的课程名:");
        String checkName = input.nextLine();
        List<Score> scoreArrayList = findClass(checkName,scores);
        if(scoreArrayList.isEmpty()) System.out.println("该课程不存在!");
        else{
            Collections.sort(scoreArrayList);
            System.out.println("最高成绩为:"+scoreArrayList.get(0).getScore());
            System.out.println("最低成绩为:"+scoreArrayList.get(scoreArrayList.size()-1).getScore());
        }
        System.out.println("请输入查询学生的学号:");
        String checkStudent = input.next();
        int checkNumber = Integer.parseInt(checkStudent);
        List<Score> scoreList = checkScore(checkNumber,scores);
        scoreList.forEach(e-> System.out.println(e.getClassName()+":"+e.getScore()));
    }
}
