# Minesweeper 



Relive your childhood memories playing Minesweeper! This version is simlar to traditional Minesweeper game except the user has the option to "save" game status and undo 
any number of moves. 


- The user can only undo moves after he/she has played any moves, which is true even when the previous 
saved game status is reloaded, i.e, the user cannot undo moves he/she made in that previous round 
(If the game is reloaded with 2 flagged cells from the previous round, the user cannot undo those 2
flagged cells, but can undo the 3rd flagged cell, which would count as the user's first move in this new round). 

- The game status is automatically saved when the user exits out the window, and is given the option of 
whether they want to restore previous status or start a new game when the game is reopened.

## Feature:
- The game board consists of a grid of cells, some of which contain bombs.
- The goal of the game is to uncover all the cells that do not contain bombs without triggering any bombs.
- Left-clicking on a cell reveals its content: a number indicating the number of neighboring cells containing bombs, an empty cell, or a bomb.
- Right-clicking on a cell marks it as a potential bomb with a flag.
- The game can be saved and restored, allowing the player to continue from where they left off.
- The player can undo their moves, including flagging/unflagging cells and revealing empty cells.
- The number of flags remaining is displayed in the status bar.
- The game automatically saves the current status when exiting

## Rules of the game: 
- Players start with an empty square board, representing a minefield. Clicking on a square reveals its content. Hitting a mine ends the game, while uncovering a cell without mines reveals neighboring numbers. Each number represents the count of surrounding mines. Cells can be flagged as mines by right-clicking. If adjacent cells have enough mines, empty cells are safe. Winning occurs when all mine-free boxes are opened.


## How to play:
- Left-click on a cell to reveal its content.
- Right-click on a cell to flag/unflag it as a potential bomb.
- Continue uncovering cells and flagging potential bombs until all non-bomb cells are revealed.
- Be careful not to click on a cell containing a bomb, as it will result in a loss.
- Use the number hints to deduce the locations of bombs and plan your moves strategically.
- You can undo any move by clicking the "Undo" button.
- You can view the game rules by clicking the "Rules" button.




