

public class Player implements Comparable<Player>{
	final String name;
	final String teamName;
	final int jerseyNumber;
	
	public Player(String name, String teamName, int jerseyNumber) {
		
		if (name != null && (!name.equals(""))) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Your name cannot be null or comprised of white space.");
			
		} if (teamName != null && (!teamName.equals(""))) {
			this.teamName = teamName;
		} else {
			throw new IllegalArgumentException("Your team name cannot be null or comprised of white space.");
		}
		
		if (jerseyNumber > 0) {
			this.jerseyNumber = jerseyNumber;
		} else {
			throw new IllegalArgumentException("Your jersey number must be greater than zero.");
		}
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", teamName=" + teamName + ", jerseyNumber=" + jerseyNumber + "]";
	}

	public String getName() {
		return name;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	@Override
	public int compareTo(Player o) {
			return o.getJerseyNumber() - this.getJerseyNumber();
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Player)) {
			System.out.println("I ran");
            return false;
        } else if (o == null) {
        	System.out.println("I ran");
        	return false;
        } else if (this == o) {
        	return true;
        } else {
        	Player other = (Player) o;
        	
        	boolean namesEqual = this.name.equals(other.getName());
//        	System.out.println("names: " + namesEqual + " " + this.name + " " + other.getName());
        	boolean teamsEqual = this.teamName.equals(other.getTeamName());
//        	System.out.println("teams: " + teamsEqual);
        	boolean jerseysEqual = this.jerseyNumber == other.getJerseyNumber();
//        	System.out.println("jerseys: " + jerseysEqual);
        	
        	return (namesEqual && teamsEqual && jerseysEqual);
        } 
	}
	
	
	
	
}
