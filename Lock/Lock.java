package Lock;
public class Lock {

    private int x;
    private int y;
    private int z;
    private int knob;
    private boolean isLocked;
    private boolean revolution;
    private int firstTurn;
    private int secondTurn;
    private int thirdTurn;

    public Lock() {
        x = 0;
        y = 0;
        z = 0;
        knob = 0;
        isLocked = true;
        revolution = false;
        firstTurn = -1;
        secondTurn = -1;
        thirdTurn = -1;
    }
    
    public void setLock(int setX, int setY, int setZ) {
        if (inRange(setX) && inRange(setY) && inRange(setZ)) {
            x = setX;
            y = setY;
            z = setZ;
        } else {
            throw new IllegalArgumentException("Only accepts whole numbers between 0 and 39.");
        }
    }
    public void closeLock() {
        isLocked = true;
        revolution = false;
        firstTurn = -1;
        secondTurn = -1;
        thirdTurn = -1;
    }
    public void turnClockwise(int target) {
        if (inRange(target) && target == knob && firstTurn < 0) {
            revolution = true;
            knob = target;
        } else if (inRange(target) && revolution == true && firstTurn < 0) {
            firstTurn = target;
            knob = target;
            revolution = false;
        } else if (inRange(target) && firstTurn >= 0 && secondTurn >= 0 && thirdTurn < 0) {
            thirdTurn = target;
            knob = target;
        } else if (inRange(target)) {
            closeLock();
        } else {
            throw new IllegalArgumentException("Only accepts whole number between 0 and 39.");
        }
    }
    public void turnCounterClockwise(int target) {
        if (inRange(target) && firstTurn >= 0 && secondTurn < 0) {
            knob = target;
            secondTurn = target;
        } else if (inRange(target)) {
            closeLock();
        } else {
            throw new IllegalArgumentException("Only accepts whole numbers between 0 and 39.");
        }
    }
    public void unlock(){
        if (firstTurn == x && secondTurn == y && thirdTurn == z) {
            isLocked = false;
            isLocked();
        } else {
            closeLock();
        }
    }

    private boolean isLocked() {
        return isLocked;
    }
    public int getKnobPosition() {
        return knob;
    }

    public boolean inRange(int number) {
        if (number >= 0 && number <= 39) {
            return true;
        } else {
            return false;
        }
    }
}
