package com.patterns.State.gumball;

public final class GumballMachine {

    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count;

    public GumballMachine(final int count) {
        this.count = count;
        if (count > 0) {
            this.state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (this.state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (this.state == NO_QUARTER) {
            this.state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (this.state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (this.state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (this.state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            this.state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (this.state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if (this.state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (this.state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if (this.state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        } else if (this.state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            this.state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (this.state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            this.count--;
            if (this.count == 0) {
                System.out.println("Oops, out of gumballs!");
                this.state = SOLD_OUT;
            } else {
                this.state = NO_QUARTER;
            }
        } else if (this.state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (this.state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (this.state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    public void refill(final int numGumBalls) {
        this.count = numGumBalls;
        this.state = NO_QUARTER;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: ").append(this.count).append(" gumball");
        if (this.count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (this.state == SOLD_OUT) {
            result.append("sold out");
        } else if (this.state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (this.state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (this.state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}


