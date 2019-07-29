public class message {

	public void 스토리시작() {
		System.out.println("<도움말>------------------------------------------");
		System.out.println("상태창을 확인 하고 싶을 땐 i를 눌러주시면 됩니다.");
		System.out.println("스킬을 확인하고 싶을 땐 k를 누르시면 됩니다.");
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println("당신은 태초마을의 리무녁");
		System.out.println("오늘도 전직을 하기 위해 모험을 떠난다.");
		System.out.println();
	}

	public void 이동(character character, monster monster) {
		if (character.name == "소울주니어" || character.name == "소울시니어" || character.name == "소울마스터") {
			System.out.println(character.name + "는 이동 중 입니다.");
			System.out.println("------------------------------------------------");
		} else
			System.out.println(character.name + "은 이동 중 입니다.");
		System.out.println("----------------------------------------------------");
		if (monster.name == "피카츄") {
			System.out.println("당신은 지금 숲속에 있습니다.");
			System.out.println("어딘가에서 풀숲이 움직이는 소리가 들립니다.");
			System.out.println("------------------------------------------------");
			System.out.println("피카츄를 만났습니다!!");
			System.out.println("피카츄의 체력:" + monster.hp);
			System.out.println("피카츄의 공격력:" + monster.attack_value);
			System.out.println("피카츄의 방어력:" + monster.defend_value);
			System.out.println("------------------------------------------------");
		}
		if (monster.name == "람머스") {
			System.out.println("당신은 소환사의 협곡으로 향했습니다.");
			System.out.println("어둠 속에서 무언가 빠른 속도로 오는 소리가 들립니다!!");
			System.out.println("------------------------------------------------");
			System.out.println("람머스와 마주쳤습니다!!");
			System.out.println("람머스의 체력:" + monster.hp);
			System.out.println("람머스의 공격력:" + monster.attack_value);
			System.out.println("람머스의 방어력:" + monster.defend_value);
			System.out.println("------------------------------------------------");
		}
		if (monster.name == "군다") {
			System.out.println("저 멀리 로스릭 성이 보입니다.");
			System.out.println("근처에서 육중한 발걸음 소리가 들립니다!!");
			System.out.println("------------------------------------------------");
			System.out.println("군다와 조우했습니다!!");
			System.out.println("군다의 체력:" + monster.hp);
			System.out.println("군다의 공격력:" + monster.attack_value);
			System.out.println("군다의 방어력:" + monster.defend_value);
			System.out.println("------------------------------------------------");
		}
		if (monster.name == "디아블로") {
			System.out.println("수정회랑 깊숙한 곳에 도착했습니다.");
			System.out.println("디아블로가 살기를 내뿜으며 기다리고 있습니다...");
			System.out.println("------------------------------------------------");
			System.out.println("디아블로와 전투를 시작합니다!!");
			System.out.println("디아블로의 체력:" + monster.hp);
			System.out.println("디아블로의 공격력:" + monster.attack_value);
			System.out.println("디아블로의 방어력:" + monster.defend_value);
			System.out.println("------------------------------------------------");
		}
	}

	public void 몹정보(monster monster) {
		System.out.println("------------------------------------------------");
		System.out.println(monster.name + "의 상태");
		System.out.println(monster.name + "의 체력:" + monster.hp);
		System.out.println(monster.name + "의 공격력:" + monster.attack_value);
		System.out.println(monster.name + "의 방어력:" + monster.defend_value);
		System.out.println("------------------------------------------------");
	}

	public void 전투창(character character) {
		System.out.println();
		System.out.println("현재 상태---------------------------------------");
		System.out.println(character.name + "의 체력:" + character.hp + "/" + character.max_hp);
		System.out.println(character.name + "의 마나:" + character.mp + "/" + character.max_mp);
		System.out.println(character.name + "의 공격력:" + (character.attack_value + character.weapon.attack_value));
		System.out.println(character.name + "의 방어력:" + (character.defend_value + character.equip.defend_value));
		System.out.println("------------------------------------------------");
		System.out.println("행동을 취하세요");
		System.out.println("공격=1 도구=2");
		System.out.println("------------------------------------------------");
	}

	public void 포션() {
		System.out.println("도구창");
		System.out.println("체력포션=1" + " 마나포션=2");
		System.out.println("------------------------------------------------");
	}

	public void 포션표시(portion portion) {
		System.out.println("체력포션: " + portion.number + "/5");
		System.out.println("-------------------------------------------------");
	}

	public void 포션표시2(portion portion) {
		System.out.println("마나포션: " + portion.number + "/5");
		System.out.println("-------------------------------------------------");
	}

	public void 체력포션(character character, portion portion) {
		if (portion.number > 0) {
			character.hp = character.max_hp;
			portion.number--;
			System.out.println("포션 개수:" + portion.number + "/5");
			System.out.println("체력이 회복되었습니다.");
			System.out.println("--------------------------------------------------");
		} else
			System.out.println("체력포션을 다 사용하셨습니다.");
		System.out.println("------------------------------------------------");
	}

	public void 마나포션(character character, portion portion) {
		if (portion.number > 0) {
			character.mp = character.max_mp;
			portion.number--;
			System.out.println("포션 개수:" + portion.number + "/5");
			System.out.println("마나가 회복되었습니다.");
			System.out.println("------------------------------------------------");
		} else
			System.out.println("마나포션을 다 사용하셨습니다.");
		System.out.println("------------------------------------------------");
	}

	public void 스킬창(character character, skill skil) {
		System.out.println("스킬을 사용하세요.");
		System.out.println(skil.name + "=1 \n데미지:" + skil.damage + " 소모마나:" + skil.use_mp);
		System.out.println("------------------------------------------------");
	}

	public void 전직(monster monster, character character) {
        if (monster.name == "피카츄") {
            System.out.println("축하합니다!! 첫 전직을 하실 수 있습니다!!!");
            System.out.println("선택하실 수 있는 루트는 미하일루트=1 와 소울마스터루트=2 입니다.");
            System.out.println("------------------------------------------------");
        }
        if (monster.name == "람머스" && character.name == "미하일") {
                System.out.println("축하합니다!! 미하일에서 기사미하일로 전직하셨습니다!!!");
                System.out.println("------------------------------------------------");
        }
        if (monster.name == "람머스" && character.name == "소울주니어") {
                System.out.println("축하합니다!! 소울주니어에서 소울시니어로 전직하셨습니다!!!");
                System.out.println("------------------------------------------------");
        }
        if (monster.name == "군다" && character.name == "기사미하일") {
                System.out.println("축하합니다!! 기사미하일에서 검성미하일로 전직하셨습니다!!");
                System.out.println("------------------------------------------------");
        }
        if (monster.name == "군다" && character.name == "소울시니어") {
                System.out.println("축하합니다!! 소울시니어에서 소울마스터로 전직하셨습니다!!");
                System.out.println("------------------------------------------------");
        }
    }

	public void 전직완료(character character) {
		System.out.println("축하합니다!! 당신은 " + character.name + "로 전직하셨습니다!!");
		System.out.println("------------------------------------------------");
	}
}