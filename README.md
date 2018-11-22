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

    The game is played with balls that number from 1 to 7. You lose the game by letting the balls pile up to the top of the screen. You can pop balls by clicking on the button on top of the stack. if the number of balls horizontally adds up to the number on the ball it will pop.
    Every 14 balls dropped a row of 7 white balls appears on the bottom of the board, pushing the stack higher. You lose if a ball gets pushed above the top of the screen. The game records your score which is calculated by adding up all the balls you popped. when the game is over it writes your score to a file. The opening screen appears some simple statistics like average score, highscore etc. You can use a custom file for the ball colors. If you don't it will use a defaut profile that comes with the game.
    Compare class does the heavy lifting for checking whether a ball in the array needs to be popped or needs to move position.
### turn steps:
    1. turn starts. 
TODO: rename variables in boardGUI


### Feature Ideas



~
### terminal commands
pwd -  print working directly (this is for finding out where you are in the system.
cd - Change Directory
cd .. - go up one directory
cd _ - go back to where I just was.
ls - list files and directories
ls -a show all the files even the hidden ones.
open (name of file) - this will open files with a gui from the terminal like a muffuckin Gangsta.
### git commands
git commit (name of files or use . to  commit all the changes) -m"(write a message that says the work you did)"
git pull - run this everytime you start working. or anytime I need you to see changes
git push - this pushes the changes to git hub so I can have your work and it can be saved in the cloud!
git status - tells you if you have commits that need to be pushed to git hub

