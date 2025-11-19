class Warrior extends Hero{
    public Warrior(String name){
        super(name, 200, 100);
        skill = new Skill[]{
            new Skill("Slash", 30, 10),
            new Skill("Power Strike",60,30),
            new Skill("Tornado Slash", 50 , 35)
        };
    }
    @Override
    public void attack(int skillIndex, Hero target){
        super.attack(skillIndex, target);
    }
     public String[] getSkill(){
        return new String[]{
            skill[1].getSkill_Name(),
            skill[2].getSkill_Name(),
            skill[3].getSkill_Name()
        };
    }
     public Skill[] getSkillsArray() {
        return skill;
    }
}
