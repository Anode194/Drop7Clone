## design
### classes
    1. main
    2. ball class
        * Fields
            * private color
            * private int ballnum
            * private pointvalue
        * getters:
            * get color
            * get ballnum
            * get pointvalue
        * setters:
            *
    3. compare class
        * getters:
        * setters:
        * other:
            * printBoard
            * dropBall
            * popBalls
    4. GUI

    5. fileIO
    * Fields
        * private File colorFile
        * private Color[9] 
        * private int pointTotal
    * Methods
        * getColor Array
        * writePointTotal


### About

main gets input from the user and passes it to the compare class. compare class when init loads the array with the first set of balls.
    balls to drop are printed to the terminal at the beginning of every turn after the screen is redrawn.
    After compare gets input from the user and passes it to the dropBall method popBalls method is ran to check the array for balls to pop. If any balls are popped dropBalls and popBalls are ran again until there are no more balls to pop/drop. Then the turn starts over.
player loses if the array fills a single position in the 0'th of the first dimension of the array which is the top of the screen



~

