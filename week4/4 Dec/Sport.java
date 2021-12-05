class sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

class Sport {
    public static void main(String args[]) {
        sports s1 = new sports();
        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();
        sports s2 = new Soccer();
        System.out.println(s2.getName());
        System.out.println();
        s2.getNumberOfTeamMembers();
    }
}