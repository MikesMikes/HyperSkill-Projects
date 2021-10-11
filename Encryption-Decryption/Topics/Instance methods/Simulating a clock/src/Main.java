
class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        minutes++;
        if (minutes == 60) {
            if (hours == 12) {
                hours = 1;
                minutes = 0;
            } else {
                hours++;
                minutes = 0;
            }
        }
    }
}