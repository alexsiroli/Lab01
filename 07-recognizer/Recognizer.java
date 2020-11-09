class Recognizer {
	int next;
    boolean ok;

    void build() {
        next = 1;
        ok = true;
    }

    boolean check1(int n) {
        return check(n, 2);
    }

    boolean check2(int n) {
        return check(n, 3);
    }

    boolean check3(int n) {
        return check(n, 4);
    }

    boolean check4(int n) {
        return check(n, 1);
    }

    boolean check(int now, int next) {
        if (now != this.next) {
            ok = false;
        }
        this.next = next;
        return ok;
    }

    void reset() {
        next = 1;
        ok = true;
    }

    int nextExpectedInt() {
        return next;
    }
}
