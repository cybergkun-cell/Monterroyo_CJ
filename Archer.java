class Archer extends Hero{
    public Archer(String name){
        super(name, 160, 140);
        skill = new Skill[]{
            new Skill("Arrow Shot",30,40),
            new Skill("Multi Shot", 50, 60),
            new Skill("Peircing Arrow",80 ,100)
        };
    }
     @Override
    public void attack(int skillIndex, Hero target) {
        
        super.attack(skillIndex, target);
    }
    
}