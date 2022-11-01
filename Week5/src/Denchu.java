public class Denchu {
    int height;
    int weight;
    int amount_charge;
    int amount_generate;

    Denchu(int height, int weight, int charge, int gen) {
        this.height = height;
        this.weight = weight;
        this.amount_charge = charge;
        this.amount_generate = gen;
    }

    int estimateAttack() {
        return this.height * this.weight * this.amount_charge;
    }

    int estimateDefence() {
        return this.height + this.weight;
    }
}
