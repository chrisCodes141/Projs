/*
     Source of information 
     https://expressjs.com/en/starter/static-files.html
     https://expressjs.com/en/starter/hello-world.html
*/


const express = require('express')
const app = express()
const port = 3000

app.use(express.static('public'))

app.get('/hello', (req, res) =>  {
    res.send('Hello World!')
})

app.get('/author', (req, res) =>  {
    res.json({"author" : "peter.parker"})
})

// http://localhost:3000/tictactoe?moves=012345678
app.get('/tictactoe', (req, res ) => {

    var status = {
        whoWon: "?",
        winningCombo: [],
        isWinner: false
    }

    // logic to determine a winner
    let moves = req.query.moves
    let aMoves = moves.split("");
    
    if (aMoves[0] == "X"
           && aMoves[1] == "X"
           && aMoves[2] == "X"){
               
        status.whoWon = "X"
        status.winningCombo =  [0,1,2]
        status.isWinner = true
    }
    res.json(status)
})

app.listen(port, () => {  
    console.log(`Example app listening on port ${port}!`) 
})