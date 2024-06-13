
package blackjackjava;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import static java.util.Map.entry;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


/**
 * @author AdeolaOdusola
 */
public class BlackjackJava extends javax.swing.JFrame {

    private final String[] cards = {"Ace of clubs", "2 of clubs", "3 of clubs", "4 of clubs", "5 of clubs",
        "6 of clubs", "7 of clubs", "8 of clubs", "9 of clubs", "10 of clubs",
        "King of clubs", "Queen of clubs", "Jack of clubs",
        "Ace of diamonds", "2 of diamonds", "3 of diamonds", "4 of diamonds", "5 of diamonds",
        "6 of diamonds", "7 of diamonds", "8 of diamonds", "9 of diamonds", "10 of diamonds",
        "King of diamonds", "Queen of diamonds", "Jack of diamonds",
        "Ace of hearts", "2 of hearts", "3 of hearts", "4 of hearts", "5 of hearts",
        "6 of hearts", "7 of hearts", "8 of hearts", "9 of hearts", "10 of hearts",
        "King of hearts", "Queen of hearts", "Jack of hearts",
        "Ace of spades", "2 of spades", "3 of spades", "4 of spades", "5 of spades",
        "6 of spades", "7 of spades", "8 of spades", "9 of spades", "10 of spades",
        "King of spades", "Queen of spades", "Jack of spades"};
    private final ArrayList<String> deck = new ArrayList<>();
    private final ArrayList<String> playerCards = new ArrayList<>();
    private final ArrayList<String> dealerCards = new ArrayList<>();
    private String outputDisplay = "";
    private int playerCardCounter = 2;
    private int dealerCardCounter = 2;
    private static int playerWins = 0;
    private static int dealerWins = 0;
    // swing variables
    private javax.swing.JButton startGame;
    private javax.swing.JButton exitGame;
    private javax.swing.JButton stand;
    private javax.swing.JButton hit;
    private javax.swing.JButton help;
    private javax.swing.JLabel player;
    private javax.swing.JLabel dealer;
    private javax.swing.JLabel pCard1;
    private javax.swing.JLabel pCard2;
    private javax.swing.JLabel pCard3;
    private javax.swing.JLabel pCard4;
    private javax.swing.JLabel pCard5;
    private javax.swing.JLabel pCard6;
    private javax.swing.JLabel pCard7;
    private javax.swing.JLabel pCard8;
    private javax.swing.JLabel dCard1;
    private javax.swing.JLabel dCard2;
    private javax.swing.JLabel dCard3;
    private javax.swing.JLabel dCard4;
    private javax.swing.JLabel dCard5;
    private javax.swing.JLabel dCard6;
    private javax.swing.JLabel dCard7;
    private javax.swing.JLabel dCard8;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel scoreBoard;
    private javax.swing.JLabel playerScore;
    private javax.swing.JLabel dealerScore;
    private javax.swing.JTextField scoreTextField;
    private javax.swing.JTextArea gameHistory;
    private javax.swing.JScrollPane scroller;
    private javax.swing.JLabel outcomeMessage;
    // End of variables declaration           

    /**
     * Creates new form BlackJack
     */
    public BlackjackJava() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                        
    private void initComponents() {
        JFrame frame = new JFrame("BlackJack");
        JPanel panel = new JPanel();
        frame.getContentPane();
       
        //frame.setResizable(false);
         
        startGame = new javax.swing.JButton("start game");
        exitGame = new javax.swing.JButton("exit game");
        stand = new javax.swing.JButton("stand");
        hit = new javax.swing.JButton("hit");
        help = new javax.swing.JButton("help");
        player = new javax.swing.JLabel("player (you)");
        dealer = new javax.swing.JLabel("dealer (computer)");
        pCard1 = new javax.swing.JLabel();
        pCard2 = new javax.swing.JLabel();
        pCard3 = new javax.swing.JLabel();      
        pCard4 = new javax.swing.JLabel();
        pCard5 = new javax.swing.JLabel();
        pCard6 = new javax.swing.JLabel();      
        pCard7 = new javax.swing.JLabel();
        pCard8 = new javax.swing.JLabel();
        dCard1 = new javax.swing.JLabel();
        dCard2 = new javax.swing.JLabel();
        dCard3 = new javax.swing.JLabel();
        dCard4 = new javax.swing.JLabel();
        dCard5 = new javax.swing.JLabel();
        dCard6 = new javax.swing.JLabel();
        dCard7 = new javax.swing.JLabel();
        dCard8 = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        scoreBoard = new javax.swing.JLabel("SCORE");
        playerScore = new javax.swing.JLabel("Player");
        dealerScore = new javax.swing.JLabel("Dealer");
        scoreTextField = new javax.swing.JTextField();
        gameHistory = new javax.swing.JTextArea("game log");
        outcomeMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        player.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/player.png"))); 
        player.setHorizontalTextPosition(JLabel.CENTER);
        player.setVerticalTextPosition(JLabel.TOP);
        
        dealer.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/dealer.png"))); 
        dealer.setHorizontalTextPosition(JLabel.CENTER);
        dealer.setVerticalTextPosition(JLabel.TOP);
        
        startGame.addActionListener(this::startGameActionPerformed);
        stand.addActionListener(this::standActionPerformed);
        hit.addActionListener(this::hitActionPerformed);
        help.addActionListener(this::helpActionPerformed);
        
        stand.setToolTipText("click this button when you are satisfied with your cards");
        hit.setToolTipText("click this button to pick another card");
        help.setToolTipText("click this button to ask for an hint");
        
        scoreTextField.setColumns(5);

        exitGame.addActionListener(this::exitGameActionPerformed);
        
        //postion components
        Dimension size = startGame.getPreferredSize();
        startGame.setBounds(50, 10, size.width, size.height);
        size = exitGame.getPreferredSize();
        exitGame.setBounds(750, 10, size.width, size.height);
        size = stand.getPreferredSize();
        stand.setBounds(350, 500, size.width, size.height);
        size = hit.getPreferredSize();
        hit.setBounds(410, 500, size.width, size.height);
        size = help.getPreferredSize();
        help.setBounds(450, 500, size.width, size.height);
        size = player.getPreferredSize();
        player.setBounds(50, 50, size.width, size.height);
        pCard1.setBounds(50, 150, 100, 100);
        pCard2.setBounds(130, 150, 100, 100);
        pCard3.setBounds(210, 150, 100, 100);
        pCard4.setBounds(290, 150, 100, 100);
        pCard5.setBounds(50, 260, 100, 100);
        pCard6.setBounds(130, 260, 100, 100);
        pCard7.setBounds(210, 260, 100, 100);
        pCard8.setBounds(290, 260, 100, 100);
        size = dealer.getPreferredSize();
        dealer.setBounds(750, 50, size.width, size.height);
        dCard1.setBounds(750, 150, 100, 100);
        dCard2.setBounds(670, 150, 100, 100);
        dCard3.setBounds(590, 150, 100, 100);
        dCard4.setBounds(510, 150, 100, 100);
        dCard5.setBounds(750, 260, 100, 100);
        dCard6.setBounds(670, 260, 100, 100);
        dCard7.setBounds(590, 260, 100, 100);
        dCard8.setBounds(510, 260, 100, 100);
        size = scoreBoard.getPreferredSize();
        scoreBoard.setBounds(400, 600, size.width, size.height);
        scoreBoard.setForeground(Color.blue);
        size = playerScore.getPreferredSize();
        playerScore.setBounds(350, 630, size.width, size.height);
        size = dealerScore.getPreferredSize();
        dealerScore.setBounds(460, 630, size.width, size.height);
        size = scoreTextField.getPreferredSize();
        scoreTextField.setBounds(387, 620, size.width, size.height);    
        gameHistory.setEditable(false);
        gameHistory.setLineWrap(true);
        gameHistory.setWrapStyleWord(true);
        //
        scroller = new JScrollPane(gameHistory);
        scroller.setBounds(50, 300, 250, 350);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        outcomeMessage.setBounds(400, 525, 350, 100);
        outcomeMessage.setForeground(Color.red);
        
        stand.setVisible(false);
        hit.setVisible(false);
        help.setVisible(false);
        
        
        panel.setLayout(null);
        
        // add to panel
        panel.add(startGame);
        panel.add(exitGame);
        panel.add(stand);
        panel.add(hit);
        panel.add(help);
        panel.add(player);
        panel.add(dealer);
        panel.add(pCard1);
        panel.add(pCard2);
        panel.add(pCard3);
        panel.add(pCard4);
        panel.add(pCard5);
        panel.add(pCard6);
        panel.add(pCard7);
        panel.add(pCard8);
        panel.add(dCard1);
        panel.add(dCard2);
        panel.add(dCard3);
        panel.add(dCard4);
        panel.add(dCard5);
        panel.add(dCard6);
        panel.add(dCard7);
        panel.add(dCard8);
        panel.add(separator);
        panel.add(scoreBoard);
        panel.add(playerScore);
        panel.add(dealerScore);
        panel.add(scoreTextField);
        panel.add(scroller);
        panel.add(outcomeMessage);
        
        frame.add(panel);
 
        frame.setSize(900, 700);
 
        frame.setVisible(true);        
    }                    
    
    public void reset(){
        this.deck.clear();
        this.outputDisplay = "";
        outcomeMessage.setText("");
        this.playerCards.clear();
        this.dealerCards.clear();
        pCard1.setIcon(null);
        pCard2.setIcon(null);
        pCard3.setIcon(null);
        pCard4.setIcon(null);
        pCard5.setIcon(null);
        dCard1.setIcon(null);
        dCard2.setIcon(null);
        dCard3.setIcon(null);
        dCard4.setIcon(null);
        dCard5.setIcon(null);
        this.playerCardCounter = 2;
        this.dealerCardCounter = 2;
        this.hideButtons();
    }
    
    public void loadAndShuffle(){
         // load deck
        this.deck.addAll(Arrays.asList(this.cards));
        // shuffle deck
        this.outputDisplay += "shuffling cards...and dealing cards...\n";
        gameHistory.setText(outputDisplay);
        Collections.shuffle(deck);
    }
    
    public String pickCard() {
        // pick from top of deck
        String card = this.deck.get(0);
        // remove from deck
        this.deck.remove(0);
        return card;
    }

    public void dealCards() {
        try {
            // deal
            String card = this.pickCard();
            this.playerCards.add(card);
            String image = card.replace(" of ", "_").toLowerCase()+".png";
            pCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image)));
            
            card = this.pickCard();
            this.dealerCards.add(card);
            image = card.replace(" of ", "_").toLowerCase()+".png";
            dCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image)));
            
            card = this.pickCard();
            this.playerCards.add(card);
            image = card.replace(" of ", "_").toLowerCase()+".png";
            pCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image)));
            
            card = this.pickCard();
            this.dealerCards.add(card);
            dCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/back_of_card.png")));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public boolean isNumeric(String string) {
        boolean numeric = true;
        try {
            Double.valueOf(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        return numeric;
    }

    public String displayProcess(String card, String[] cardArray, char suit) {
        String cardForDisplay;
        if (cardArray[0].equals("1") || cardArray[0].equals("11")) {
            cardForDisplay = "A" + (char) suit;
        } else if (!this.isNumeric(cardArray[0])) {
            cardForDisplay = card.charAt(0) + "" + (char) suit;
        } else {
            cardForDisplay = cardArray[0] + suit;
        }
        return cardForDisplay;
    }

    public ArrayList<String> displayCards(ArrayList<String> cs) {
        ArrayList<String> cardsForDisplay = new ArrayList<>();
        Map<String, Character> suits = Map.ofEntries(
                entry("clubs", '\u2663'),
                entry("diamonds", '\u2666'),
                entry("hearts", '\u2764'),
                entry("spades", '\u2660')
        );
        for (String card : cs) {
            String[] cardArray = card.split(" ");
            if (card.contains("clubs")) {
                String cardForDisplay = this.displayProcess(card, cardArray, suits.get("clubs"));
                cardsForDisplay.add(cardForDisplay);
            }
            if (card.contains("diamonds")) {
                String cardForDisplay = this.displayProcess(card, cardArray, suits.get("diamonds"));
                cardsForDisplay.add(cardForDisplay);
            }
            if (card.contains("hearts")) {
                String cardForDisplay = this.displayProcess(card, cardArray, suits.get("hearts"));
                cardsForDisplay.add(cardForDisplay);
            }
            if (card.contains("spades")) {
                String cardForDisplay = this.displayProcess(card, cardArray, suits.get("spades"));
                cardsForDisplay.add(cardForDisplay);
            }
        }
        return cardsForDisplay;
    }

    public void viewPlayerCards() {
        ArrayList<String> display = this.displayCards(this.playerCards);
        this.outputDisplay += "player's cards: " + display.toString() + "\n";
        gameHistory.setText(outputDisplay);
    }

    public void viewDealerCards(boolean initial) {
        ArrayList<String> display = this.displayCards(this.dealerCards);
        if (initial) {
            // hide dealer's second card
            this.outputDisplay += "dealer's cards: [" + display.get(0) + " *]\n";
            gameHistory.setText(outputDisplay);
        } else {
            this.outputDisplay += "dealer's cards: " + display.toString() + "\n";
            gameHistory.setText(outputDisplay);
        }
    }

    public int getTotal(ArrayList<String> cs) {
        int total = 0;
        for (String card : cs) {
            if (card.contains("King")) {
                total += 10;
            } else if (card.contains("Queen")) {
                total += 10;
            } else if (card.contains("Jack")) {
                total += 10;
            } else {
                String[] cardArray = card.split(" ");
                String number = cardArray[0];
                total += Integer.parseInt(number);
            }
        }
        return total;
    }

    public int playerHint(int total) {
        int hint;
        int potentialTotal;
        // first peek at the card, then return decision
        String nextCard = this.deck.get(0);
        ArrayList<String> nextCardList = new ArrayList<>();
        nextCardList.add(nextCard);
        ArrayList<String> nextCardArray = this.displayCards(nextCardList);
        this.outputDisplay += "peeking at next card in deck..." + nextCardArray.get(0) + "\n";
        gameHistory.setText(outputDisplay);
        if (nextCard.contains("Ace")) {
            nextCard = "11";
            nextCardList.set(0, nextCard);
            potentialTotal = total + this.getTotal(nextCardList);
            if (potentialTotal > 21){
                // try 1 instead of 11
                nextCard = "1";
                nextCardList.set(0, nextCard);
            }
        }
        potentialTotal = total + this.getTotal(nextCardList);
        if (potentialTotal > 21) {
            // stand - do not pick another card - it will be over 21
            hint = 1;
        } else {
            // pick another card
            hint = 2;
        }
        return hint;
    }

    public void playerDecision() {
        int index = 0;
        int ace;
        for (String pCard : this.playerCards) {
            if (pCard.contains("Ace")) {
                String suit = pCard.replace("Ace", "");
                while (true) {
                    try {
                        ace = Integer.parseInt(JOptionPane.showInputDialog("What is your Ace value? Enter 1 or 11:"));
                        if (ace != 1 && ace != 11) {
                            JOptionPane.showMessageDialog(null, "Enter 1 or 11!");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Input Exception! Enter 1 or 11: " + ex);
                    }
                }
                this.playerCards.set(index, ace + suit);
            }
            ++index;
        }
    }

    public int dealerDecision() {
        // player is done - show all dealer cards
        int soft = 17;
        int index = 0;
        int total;
        int choice = 0;
        String card = this.dealerCards.get(1);
        try{           
            // show hidden card
            String image = card.replace(" of ", "_").toLowerCase()+".png";
            dCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image)));
            // check ace and try 11 first           
            for (String dCard : this.dealerCards) {
                if (dCard.contains("Ace")) {
                    String suit = dCard.replace("Ace", "");
                    this.dealerCards.set(index, "11" + suit);
                    total = this.getTotal(this.dealerCards);
                    if (total > 21) {
                        // busted with 11, so use 1
                        this.dealerCards.set(index, "1" + suit);
                    }
                }
                ++index;
            }
            total = this.getTotal(this.dealerCards);
            if (total > 21) {
                this.outputDisplay += "Dealer is busted!\n";
                gameHistory.setText(outputDisplay);
                return 0;
            }
            if (total >= soft) {
                choice = 0;
                this.outputDisplay += "Dealer decides to stand!\n";
                gameHistory.setText(outputDisplay);
            } else {
                choice = 1;
                ++this.dealerCardCounter;
                card = this.pickCard();
                this.dealerCards.add(card);
                // pane
                this.outputDisplay += "Dealer is picking another card!...\n";
                gameHistory.setText(outputDisplay);
                // gui
                image = card.replace(" of ", "_").toLowerCase()+".png";
                if (this.dealerCardCounter == 3){
                    dCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
                }
                if (this.dealerCardCounter == 4){
                    dCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
                }
                if (this.dealerCardCounter == 5){
                    dCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
                }
                if (this.dealerCardCounter == 6){
                    dCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
                }
                if (this.dealerCardCounter == 7){
                    dCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
                }
                if (this.dealerCardCounter == 8){
                    dCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
                }
            }
        }catch(Exception e){
            System.out.println("Exception: "+card+" "+e);
        }
        return choice;       
    }

    public String displayResults(int pTotal, int dTotal) {
        if (pTotal > 21 && dTotal > 21) {
            String output = """
                            Both player and dealer are busted!
                            Player total: """ + pTotal + "\n"
                    + "Dealer total: " + dTotal + "\n"
                    + "Game ends in a tie!\n";
            this.outputDisplay += output;
            gameHistory.setText(outputDisplay);
            outcomeMessage.setText("Game ends in a tie! Click start game to play another round!");
            return "tie";
        } else if (pTotal > 21 && dTotal <= 21) {
            String output = """
                            Player is busted!
                            Player total: """ + pTotal + "\n"
                    + "Dealer total: " + dTotal + "\n"
                    + "Dealer wins the game!\n";
            this.outputDisplay += output;
            gameHistory.setText(outputDisplay);
            outcomeMessage.setText("Dealer wins the game! Click start game to play another round!");
            return "dealer";
        } else if (dTotal > 21 && pTotal <= 21) {
            String output = """
                            Dealer is busted!
                            Player total: """ + pTotal + "\n"
                    + "Dealer total: " + dTotal + "\n"
                    + "Player wins the game!\n";
            this.outputDisplay += output;
            gameHistory.setText(outputDisplay);
            outcomeMessage.setText("Player wins the game! Click start game to play another round!");
            return "player";
        } else if (pTotal == dTotal) {
            String output = """
                            Player total: """ + pTotal + "\n"
                    + "Dealer total: " + dTotal + "\n"
                    + "Game ends in a tie!\n";
            this.outputDisplay += output;
            gameHistory.setText(outputDisplay);
            outcomeMessage.setText("Game ends in a tie! Click start game to play another round!");
            return "tie";
        } else if (pTotal > dTotal) {
            String output = """
                            Player total: """ + pTotal + "\n"
                    + "Dealer total: " + dTotal + "\n"
                    + "Player wins the game!\n";
            this.outputDisplay += output;
            gameHistory.setText(outputDisplay);
            outcomeMessage.setText("Player wins the game! Click start game to play another round!");
            return "player";
        } else if (dTotal > pTotal) {
            String output = """
                            Player total: """ + pTotal + "\n"
                    + "Dealer total: " + dTotal + "\n"
                    + "Dealer wins the game!\n";
            this.outputDisplay += output;
            gameHistory.setText(outputDisplay);
            outcomeMessage.setText("Dealer wins the game! Click start game to play another round!");
            return "dealer";
        }
        return "";
    }

    private void showButtons(){
        stand.setVisible(true);
        hit.setVisible(true);
        help.setVisible(true);
    }
    
    private void hideButtons(){
        stand.setVisible(false);
        hit.setVisible(false);
        help.setVisible(false);    
    }
    
    private void helpActionPerformed(java.awt.event.ActionEvent evt){
        int hint = this.playerHint(this.getTotal(this.playerCards));
        if (hint == 1) {
            this.outputDisplay += "You are advised to stand!\n";
            JOptionPane.showMessageDialog(null, "You are advised to stand!\n");
            gameHistory.setText(outputDisplay);
        } else {
            this.outputDisplay += "You are advised to pick another card!\n";
            JOptionPane.showMessageDialog(null, "You are advised to pick another card!\n");
            gameHistory.setText(outputDisplay);
        }
    }
    
    private void hitActionPerformed(java.awt.event.ActionEvent evt){
        // pick another card
        String card = this.pickCard();
        this.playerCards.add(card);
        ++this.playerCardCounter;
        this.outputDisplay += "picking another card for player..." + card + "\n";
        gameHistory.setText(outputDisplay);                  
        // gui
        String image = card.replace(" of ", "_").toLowerCase()+".png";
        if (this.playerCardCounter == 3){
            pCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
        }
        if (this.playerCardCounter == 4){
            pCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
        }
        if (this.playerCardCounter == 5){
            pCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
        }
        if (this.playerCardCounter == 6){
            pCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
        }
        if (this.playerCardCounter == 7){
            pCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
        }
        if (this.playerCardCounter == 8){
            pCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/"+image))); 
        }
        // run player decision for ace choice
        this.playerDecision();
        // show player's current total
        int total = this.getTotal(this.playerCards);
        this.outputDisplay += "player's current total is: " + total + "\n";
        gameHistory.setText(outputDisplay);
        // auto stand if over 21
        if (total > 21){
            this.standProcessOver21();
        }
    }
    
    private void standActionPerformed(java.awt.event.ActionEvent evt){
        int pickAnotherCard = 1;
        this.outputDisplay += "player decides to stand...\n";
        gameHistory.setText(outputDisplay);
        int playerTotal = this.getTotal(this.playerCards);
        // process for dealer
        while(true){
            int decision = this.dealerDecision();
            if (decision != pickAnotherCard){
                break;
            }
        }
        int dealerTotal = this.getTotal(this.dealerCards);
        // display results
        String winner = this.displayResults(playerTotal, dealerTotal);
        // store win records
        if (winner.equals("player") ){
            ++playerWins;
        }
        else if (winner.equals("dealer")){
            ++dealerWins;
        }
        // display record in UI
        this.scoreTextField.setText(playerWins + " - " + dealerWins);
        // end
        String end = "*********END OF GAME**********\n";
        this.outputDisplay += end;
        gameHistory.setText(outputDisplay);
        this.hideButtons();
    }
    
    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //reset components
        this.reset();
        // game play
        String welcome = "*****WELCOME TO BLACKJACK*****\n";  
        this.outputDisplay += welcome;
        gameHistory.setText(this.outputDisplay);
        this.loadAndShuffle();
        this.dealCards();
        // run player decision for ace choice
        this.playerDecision();
        // show stand, hit, help buttons
        this.showButtons();
        // show player's current total
        int total = this.getTotal(this.playerCards);
        this.outputDisplay += "player's current total is: " + total + "\n";
        gameHistory.setText(outputDisplay);
    }                                        

    private void standProcessOver21(){
        int pickAnotherCard = 1;
        this.outputDisplay += "player score is over 21...standing...\n";
        gameHistory.setText(outputDisplay);
        int playerTotal = this.getTotal(this.playerCards);
        // process for dealer
        while(true){
            int decision = this.dealerDecision();
            if (decision != pickAnotherCard){
                break;
            }
        }
        int dealerTotal = this.getTotal(this.dealerCards);
        // display results
        String winner = this.displayResults(playerTotal, dealerTotal);
        // store win records
        if (winner.equals("player") ){
            ++playerWins;
        }
        else if (winner.equals("dealer")){
            ++dealerWins;
        }
        // display record in UI
        this.scoreTextField.setText(playerWins + " - " + dealerWins);
        // end
        String end = "*********END OF GAME**********\n";
        this.outputDisplay += end;
        gameHistory.setText(outputDisplay);
        this.hideButtons();
    }
    
    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BlackjackJava().setVisible(true);
        });
    }

                         
}
