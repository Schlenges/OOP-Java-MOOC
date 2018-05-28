public class Tournament{
  private Participants participants;
  private int round;

  public Tournament(Participants participants){
    this.participants = participants;
    this.round = 0;
  }

  public int getRound(){
    return this.round;
  }

  public void newRound(){
    round++;
  }
}