## design
### classes
    1. main
    2. ball class
        * Fields
            * private color
            * private int ballnum
            * private pointvalue
            * private isWhite bool
        * getters:
            * get color()
            * get ballnum()
            * get pointvalue()
        * setters:
            *
    3. compare class
        * getters:
            *  getBallColor()
        * setters:
            * set newBall()
        * other:
            * levelUp()
            * popBalls()
            * shiftBalls()
            * crackWhileBall()
    4. GUI
        * 49 Jbuttons
        * score jtextfield
        * next buttonfield
    5. fileIO
        * Fields
            * private File colorFile()
            * private Color[9] 
            * private int pointTotal
    * Methods
            * getColor Array()
            * writePointTotal()
            * get fGroundColor()
            * get bGroundColor()

### About

    The game uses a board with 49 jButtons. Balls that aren't directly above the stack of Balls that the game starts off with. when you drop a 5 ball on a stack with 4 balls it will pop. The game works by checking how many balls are in the row and column if either adds up to the number on the ball it will pop. this works also for balls that are on the stack. if a 5ball is on the bottom of a stack of 4 balls and you drop a 3ball on it. the 5ball with pop and the stack will reset. 
    Every 14 balls dropped a row of 7 white balls appears on the bottom of the board, pushing the stack higher. You lose if a ball gets pushed above the top of the screen. The game records your score which is calculated by adding up all the balls you popped. when the game is over it writes your score to a file. The opening screen appears some simple statistics like average score, highscore etc. You can use a custom file for the ball colors. If you don't it will use a defaut profile that comes with the game.
    Compare class does the heavy lifting for checking whether a ball in the array needs to be popped or needs to move position.
~

