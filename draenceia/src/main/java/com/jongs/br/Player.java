package com.jongs.br;
import java.util.List;
import java.util.Objects;

public class Player {
    private String name;
    private String position;
    private int over;
    private String nacionality;
    private String league;
    private String club;
    private String playingStyle;
    private int offensiveAwareness;
    private int ballControll;
    private int dribbling;
    private int tightPossesion;
    private int lowPass;
    private int loftedPass;
    private int finishing;
    private int heading;
    private int placeKicking;
    private int curl;
    private int speed;
    private int acceleration;
    private int kickPower;
    private int jump;
    private int physicalContact;
    private int balance;
    private int stamina;
    private int defensiveAwareness;
    private int ballWinning;
    private int aggression;
    private int gkAwareness;
    private int gkCatching;
    private int gkClearing;
    private int gkReflexes;
    private int gkReach;
    private int weakFootUsage;
    private int weakFootAccuracy;
    private int form;
    private int injuryResistance;
    private int age;
    private int height;
    private int weight;
    private String strongFoot;


    public Player() {
    }

    public Player(String name, String position, int over, String nacionality, String league, String club, String playingStyle, int offensiveAwareness, int ballControll, int dribbling, int tightPossesion, int lowPass, int loftedPass, int finishing, int heading, int placeKicking, int curl, int speed, int acceleration, int kickPower, int jump, int physicalContact, int balance, int stamina, int defensiveAwareness, int ballWinning, int aggression, int gkAwareness, int gkCatching, int gkClearing, int gkReflexes, int gkReach, int weakFootUsage, int weakFootAccuracy, int form, int injuryResistance, int age, int height, int weight, String strongFoot) {
        this.name = name;
        this.position = position;
        this.over = over;
        this.nacionality = nacionality;
        this.league = league;
        this.club = club;
        this.playingStyle = playingStyle;
        this.offensiveAwareness = offensiveAwareness;
        this.ballControll = ballControll;
        this.dribbling = dribbling;
        this.tightPossesion = tightPossesion;
        this.lowPass = lowPass;
        this.loftedPass = loftedPass;
        this.finishing = finishing;
        this.heading = heading;
        this.placeKicking = placeKicking;
        this.curl = curl;
        this.speed = speed;
        this.acceleration = acceleration;
        this.kickPower = kickPower;
        this.jump = jump;
        this.physicalContact = physicalContact;
        this.balance = balance;
        this.stamina = stamina;
        this.defensiveAwareness = defensiveAwareness;
        this.ballWinning = ballWinning;
        this.aggression = aggression;
        this.gkAwareness = gkAwareness;
        this.gkCatching = gkCatching;
        this.gkClearing = gkClearing;
        this.gkReflexes = gkReflexes;
        this.gkReach = gkReach;
        this.weakFootUsage = weakFootUsage;
        this.weakFootAccuracy = weakFootAccuracy;
        this.form = form;
        this.injuryResistance = injuryResistance;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.strongFoot = strongFoot;
    }


    public Player(List<String> attributes1, List<String> attributes2, List<String> attributes3) {
        this.name = attributes1.get(0);
        this.position = attributes1.get(1);
        this.over = Integer.parseInt(attributes1.get(2));
        this.nacionality = attributes1.get(3);
        this.league = attributes1.get(4);
        this.club = attributes1.get(5);
        this.playingStyle = attributes1.get(6);
        this.offensiveAwareness = Integer.parseInt(attributes2.get(0));
        this.ballControll = Integer.parseInt(attributes2.get(1));
        this.dribbling = Integer.parseInt(attributes2.get(2));
        this.tightPossesion = Integer.parseInt(attributes2.get(3));
        this.lowPass = Integer.parseInt(attributes2.get(4));
        this.loftedPass = Integer.parseInt(attributes2.get(5));
        this.finishing = Integer.parseInt(attributes2.get(6));
        this.heading = Integer.parseInt(attributes2.get(7));
        this.placeKicking = Integer.parseInt(attributes2.get(8));
        this.curl = Integer.parseInt(attributes2.get(9));
        this.speed = Integer.parseInt(attributes2.get(10));
        this.acceleration = Integer.parseInt(attributes2.get(11));
        this.kickPower = Integer.parseInt(attributes2.get(12));
        this.jump = Integer.parseInt(attributes2.get(13));
        this.physicalContact = Integer.parseInt(attributes2.get(14));
        this.balance = Integer.parseInt(attributes2.get(15));
        this.stamina = Integer.parseInt(attributes2.get(16));
        this.defensiveAwareness = Integer.parseInt(attributes3.get(0));
        this.ballWinning = Integer.parseInt(attributes3.get(1));
        this.aggression = Integer.parseInt(attributes3.get(2));
        this.gkAwareness = Integer.parseInt(attributes3.get(3));
        this.gkCatching = Integer.parseInt(attributes3.get(4));
        this.gkClearing = Integer.parseInt(attributes3.get(5));
        this.gkReflexes = Integer.parseInt(attributes3.get(6));
        this.gkReach = Integer.parseInt(attributes3.get(7));
        this.weakFootUsage = Integer.parseInt(attributes3.get(8));
        this.weakFootAccuracy = Integer.parseInt(attributes3.get(9));
        this.form = Integer.parseInt(attributes3.get(10));
        this.injuryResistance = Integer.parseInt(attributes3.get(11));
        this.age = Integer.parseInt(attributes3.get(12));
        this.height = Integer.parseInt(attributes3.get(13));
        this.weight = Integer.parseInt(attributes3.get(14));
        this.strongFoot = attributes3.get(15);
}


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getOver() {
        return this.over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public String getNacionality() {
        return this.nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getLeague() {
        return this.league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPlayingStyle() {
        return this.playingStyle;
    }

    public void setPlayingStyle(String playingStyle) {
        this.playingStyle = playingStyle;
    }

    public int getOffensiveAwareness() {
        return this.offensiveAwareness;
    }

    public void setOffensiveAwareness(int offensiveAwareness) {
        this.offensiveAwareness = offensiveAwareness;
    }

    public int getBallControll() {
        return this.ballControll;
    }

    public void setBallControll(int ballControll) {
        this.ballControll = ballControll;
    }

    public int getDribbling() {
        return this.dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getTightPossesion() {
        return this.tightPossesion;
    }

    public void setTightPossesion(int tightPossesion) {
        this.tightPossesion = tightPossesion;
    }

    public int getLowPass() {
        return this.lowPass;
    }

    public void setLowPass(int lowPass) {
        this.lowPass = lowPass;
    }

    public int getLoftedPass() {
        return this.loftedPass;
    }

    public void setLoftedPass(int loftedPass) {
        this.loftedPass = loftedPass;
    }

    public int getFinishing() {
        return this.finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getHeading() {
        return this.heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getPlaceKicking() {
        return this.placeKicking;
    }

    public void setPlaceKicking(int placeKicking) {
        this.placeKicking = placeKicking;
    }

    public int getCurl() {
        return this.curl;
    }

    public void setCurl(int curl) {
        this.curl = curl;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration() {
        return this.acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getKickPower() {
        return this.kickPower;
    }

    public void setKickPower(int kickPower) {
        this.kickPower = kickPower;
    }

    public int getJump() {
        return this.jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getPhysicalContact() {
        return this.physicalContact;
    }

    public void setPhysicalContact(int physicalContact) {
        this.physicalContact = physicalContact;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getDefensiveAwareness() {
        return this.defensiveAwareness;
    }

    public void setDefensiveAwareness(int defensiveAwareness) {
        this.defensiveAwareness = defensiveAwareness;
    }

    public int getBallWinning() {
        return this.ballWinning;
    }

    public void setBallWinning(int ballWinning) {
        this.ballWinning = ballWinning;
    }

    public int getAggression() {
        return this.aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    public int getGkAwareness() {
        return this.gkAwareness;
    }

    public void setGkAwareness(int gkAwareness) {
        this.gkAwareness = gkAwareness;
    }

    public int getGkCatching() {
        return this.gkCatching;
    }

    public void setGkCatching(int gkCatching) {
        this.gkCatching = gkCatching;
    }

    public int getGkClearing() {
        return this.gkClearing;
    }

    public void setGkClearing(int gkClearing) {
        this.gkClearing = gkClearing;
    }

    public int getGkReflexes() {
        return this.gkReflexes;
    }

    public void setGkReflexes(int gkReflexes) {
        this.gkReflexes = gkReflexes;
    }

    public int getGkReach() {
        return this.gkReach;
    }

    public void setGkReach(int gkReach) {
        this.gkReach = gkReach;
    }

    public int getWeakFootUsage() {
        return this.weakFootUsage;
    }

    public void setWeakFootUsage(int weakFootUsage) {
        this.weakFootUsage = weakFootUsage;
    }

    public int getWeakFootAccuracy() {
        return this.weakFootAccuracy;
    }

    public void setWeakFootAccuracy(int weakFootAccuracy) {
        this.weakFootAccuracy = weakFootAccuracy;
    }

    public int getForm() {
        return this.form;
    }

    public void setForm(int form) {
        this.form = form;
    }

    public int getInjuryResistance() {
        return this.injuryResistance;
    }

    public void setInjuryResistance(int injuryResistance) {
        this.injuryResistance = injuryResistance;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStrongFoot() {
        return this.strongFoot;
    }

    public void setStrongFoot(String strongFoot) {
        this.strongFoot = strongFoot;
    }

    public Player name(String name) {
        setName(name);
        return this;
    }

    public Player position(String position) {
        setPosition(position);
        return this;
    }

    public Player over(int over) {
        setOver(over);
        return this;
    }

    public Player nacionality(String nacionality) {
        setNacionality(nacionality);
        return this;
    }

    public Player league(String league) {
        setLeague(league);
        return this;
    }

    public Player club(String club) {
        setClub(club);
        return this;
    }

    public Player playingStyle(String playingStyle) {
        setPlayingStyle(playingStyle);
        return this;
    }

    public Player offensiveAwareness(int offensiveAwareness) {
        setOffensiveAwareness(offensiveAwareness);
        return this;
    }

    public Player ballControll(int ballControll) {
        setBallControll(ballControll);
        return this;
    }

    public Player dribbling(int dribbling) {
        setDribbling(dribbling);
        return this;
    }

    public Player tightPossesion(int tightPossesion) {
        setTightPossesion(tightPossesion);
        return this;
    }

    public Player lowPass(int lowPass) {
        setLowPass(lowPass);
        return this;
    }

    public Player loftedPass(int loftedPass) {
        setLoftedPass(loftedPass);
        return this;
    }

    public Player finishing(int finishing) {
        setFinishing(finishing);
        return this;
    }

    public Player heading(int heading) {
        setHeading(heading);
        return this;
    }

    public Player placeKicking(int placeKicking) {
        setPlaceKicking(placeKicking);
        return this;
    }

    public Player curl(int curl) {
        setCurl(curl);
        return this;
    }

    public Player speed(int speed) {
        setSpeed(speed);
        return this;
    }

    public Player acceleration(int acceleration) {
        setAcceleration(acceleration);
        return this;
    }

    public Player kickPower(int kickPower) {
        setKickPower(kickPower);
        return this;
    }

    public Player jump(int jump) {
        setJump(jump);
        return this;
    }

    public Player physicalContact(int physicalContact) {
        setPhysicalContact(physicalContact);
        return this;
    }

    public Player balance(int balance) {
        setBalance(balance);
        return this;
    }

    public Player stamina(int stamina) {
        setStamina(stamina);
        return this;
    }

    public Player defensiveAwareness(int defensiveAwareness) {
        setDefensiveAwareness(defensiveAwareness);
        return this;
    }

    public Player ballWinning(int ballWinning) {
        setBallWinning(ballWinning);
        return this;
    }

    public Player aggression(int aggression) {
        setAggression(aggression);
        return this;
    }

    public Player gkAwareness(int gkAwareness) {
        setGkAwareness(gkAwareness);
        return this;
    }

    public Player gkCatching(int gkCatching) {
        setGkCatching(gkCatching);
        return this;
    }

    public Player gkClearing(int gkClearing) {
        setGkClearing(gkClearing);
        return this;
    }

    public Player gkReflexes(int gkReflexes) {
        setGkReflexes(gkReflexes);
        return this;
    }

    public Player gkReach(int gkReach) {
        setGkReach(gkReach);
        return this;
    }

    public Player weakFootUsage(int weakFootUsage) {
        setWeakFootUsage(weakFootUsage);
        return this;
    }

    public Player weakFootAccuracy(int weakFootAccuracy) {
        setWeakFootAccuracy(weakFootAccuracy);
        return this;
    }

    public Player form(int form) {
        setForm(form);
        return this;
    }

    public Player injuryResistance(int injuryResistance) {
        setInjuryResistance(injuryResistance);
        return this;
    }

    public Player age(int age) {
        setAge(age);
        return this;
    }

    public Player height(int height) {
        setHeight(height);
        return this;
    }

    public Player weight(int weight) {
        setWeight(weight);
        return this;
    }

    public Player strongFoot(String strongFoot) {
        setStrongFoot(strongFoot);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Player)) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(position, player.position) && over == player.over && Objects.equals(nacionality, player.nacionality) && Objects.equals(league, player.league) && Objects.equals(club, player.club) && Objects.equals(playingStyle, player.playingStyle) && offensiveAwareness == player.offensiveAwareness && ballControll == player.ballControll && dribbling == player.dribbling && tightPossesion == player.tightPossesion && lowPass == player.lowPass && loftedPass == player.loftedPass && finishing == player.finishing && heading == player.heading && placeKicking == player.placeKicking && curl == player.curl && speed == player.speed && acceleration == player.acceleration && kickPower == player.kickPower && jump == player.jump && physicalContact == player.physicalContact && balance == player.balance && stamina == player.stamina && defensiveAwareness == player.defensiveAwareness && ballWinning == player.ballWinning && aggression == player.aggression && gkAwareness == player.gkAwareness && gkCatching == player.gkCatching && gkClearing == player.gkClearing && gkReflexes == player.gkReflexes && gkReach == player.gkReach && weakFootUsage == player.weakFootUsage && weakFootAccuracy == player.weakFootAccuracy && form == player.form && injuryResistance == player.injuryResistance && age == player.age && height == player.height && weight == player.weight && Objects.equals(strongFoot, player.strongFoot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, over, nacionality, league, club, playingStyle, offensiveAwareness, ballControll, dribbling, tightPossesion, lowPass, loftedPass, finishing, heading, placeKicking, curl, speed, acceleration, kickPower, jump, physicalContact, balance, stamina, defensiveAwareness, ballWinning, aggression, gkAwareness, gkCatching, gkClearing, gkReflexes, gkReach, weakFootUsage, weakFootAccuracy, form, injuryResistance, age, height, weight, strongFoot);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", position='" + getPosition() + "'" +
            ", over='" + getOver() + "'" +
            ", nacionality='" + getNacionality() + "'" +
            ", league='" + getLeague() + "'" +
            ", club='" + getClub() + "'" +
            ", playingStyle='" + getPlayingStyle() + "'" +
            ", offensiveAwareness='" + getOffensiveAwareness() + "'" +
            ", ballControll='" + getBallControll() + "'" +
            ", dribbling='" + getDribbling() + "'" +
            ", tightPossesion='" + getTightPossesion() + "'" +
            ", lowPass='" + getLowPass() + "'" +
            ", loftedPass='" + getLoftedPass() + "'" +
            ", finishing='" + getFinishing() + "'" +
            ", heading='" + getHeading() + "'" +
            ", placeKicking='" + getPlaceKicking() + "'" +
            ", curl='" + getCurl() + "'" +
            ", speed='" + getSpeed() + "'" +
            ", acceleration='" + getAcceleration() + "'" +
            ", kickPower='" + getKickPower() + "'" +
            ", jump='" + getJump() + "'" +
            ", physicalContact='" + getPhysicalContact() + "'" +
            ", balance='" + getBalance() + "'" +
            ", stamina='" + getStamina() + "'" +
            ", defensiveAwareness='" + getDefensiveAwareness() + "'" +
            ", ballWinning='" + getBallWinning() + "'" +
            ", aggression='" + getAggression() + "'" +
            ", gkAwareness='" + getGkAwareness() + "'" +
            ", gkCatching='" + getGkCatching() + "'" +
            ", gkClearing='" + getGkClearing() + "'" +
            ", gkReflexes='" + getGkReflexes() + "'" +
            ", gkReach='" + getGkReach() + "'" +
            ", weakFootUsage='" + getWeakFootUsage() + "'" +
            ", weakFootAccuracy='" + getWeakFootAccuracy() + "'" +
            ", form='" + getForm() + "'" +
            ", injuryResistance='" + getInjuryResistance() + "'" +
            ", age='" + getAge() + "'" +
            ", height='" + getHeight() + "'" +
            ", weight='" + getWeight() + "'" +
            ", strongFoot='" + getStrongFoot() + "'" +
            "}";
    }
    
}
