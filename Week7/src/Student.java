public class Student {
    String name; // 氏名
    int math;// 数学の点数
    int english; // 英語の点数
    int japanese;// 国語の点数

    Student(String name, int math, int english, int japanese) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.japanese = japanese;
    }

    int totalScore() {
        return this.math + this.english + this.japanese;
    }
}
