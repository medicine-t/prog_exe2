public class Student {
    int height;
    int weight;
    int study_time;
    int game_time;
    int sleep_time;

    Student(int height, int weight, int study_time, int game_time, int sleep_time) {
        this.height = height;
        this.weight = weight;
        this.study_time = study_time;
        this.game_time = game_time;
        this.sleep_time = sleep_time;
    }

    int estimateStudy() {
        return this.study_time * this.sleep_time;
    }

    int estimateCombat() {
        return this.height + this.weight * this.study_time / 2;
    }

    int estimateESports() {
        return this.study_time * this.game_time;
    }
}
