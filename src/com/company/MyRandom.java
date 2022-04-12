package com.company;

/** Класс MyRandom основан на Линейном конгруэнтном методе**/
class MyRandom {
    private long seed = 1;

    void setSeed(long seed) {
        this.seed = seed;
    }

    int NextInt() {
        seed = seed * 252149039 + 11;
        return (int) seed;
    }

    int NextInt(int bound) {
        return NextInt() % (bound + 1);
    }
}
