package in.ac.bmsce.utsav2k18;

/**
 * Created by silky on 01-04-2018.
 */
public class events {
    public String team_size,where,when,description,rules,coordinator1name,coordinator2name,runner_up_prize,winner_prize,registration_fee;
    public String
            coordinator1no,coordinator2no;
    public events(){

    }
    public events(String where,String when,String description,String registration_fee,String rules,String runner_up_prize,
                  String team_size,String  winner_prize,String coordinator1name,String coordinator2name,
                  String coordinator1no,String coordinator2no){
        this.where=where;
        this.when=when;
        this.description=description;
        this.registration_fee=registration_fee;
        this.rules=rules;
        this.runner_up_prize=runner_up_prize;
        this.team_size=team_size;
        this.winner_prize=winner_prize;
        this.coordinator1name=coordinator1name;
        this.coordinator2name=coordinator2name;
        this.coordinator1no=coordinator1no;
        this.coordinator2no=coordinator2no;

    }

}


