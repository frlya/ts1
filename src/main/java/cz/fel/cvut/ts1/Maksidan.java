package cz.fel.cvut.ts1;

class Maksidan {
    public static long factorial (int n) {
        return  n == 1 ? 1 : n * factorial(--n);
    }
}