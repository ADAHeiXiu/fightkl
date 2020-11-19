package person;

public class Score implements Comparable<Score>{
    private int number;
    private String className;
    private int score;
    public Score(int number,String className,int score){
        this.number = number;
        this.className = className;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Score o) {
        if(this.className.compareTo(o.getClassName())>0)return 1;
        if(this.className.compareTo(o.getClassName())<0) return -1;

        if(this.score>o.getScore())return (this.score-o.getScore());
        if(this.score<o.getScore())return (o.getScore()-this.score);
        return 0;
    }

    @Override
    public String toString() {
        return "Score{" +
                "number=" + number +
                ", className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
