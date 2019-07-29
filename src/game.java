import java.util.Scanner;
import java.util.Random;

public class game {

	public static void main(String[] args) {
		// 생성한 인스턴스들
		equipment branch = new equipment("나뭇가지", 10, 0);
		equipment knight_sword = new equipment("초보 기사의 검", 1000, 0);
		equipment knight_blade = new equipment("기사 단장의 검", 5000, 0);
		equipment sword_saint = new equipment("검성의 검", 10000, 0);
		equipment 낡은세트 = new equipment("낡은 세트", 0, 50);
		equipment 초보기사세트 = new equipment("초보 기사 세트", 0, 250);
		equipment 기사단장세트 = new equipment("기사 단장 세트", 0, 500);
		equipment 검성세트 = new equipment("검성 세트", 0, 5000);
		skill 달팽이세마리 = new skill("달팽이 세마리", 50, 10);
		skill 베기 = new skill("베기", 1000, 30);
		skill 베어가르기 = new skill("베어가르기", 3000, 50);
		skill 홀리크로스 = new skill("홀리크로스", 25000, 150);
		portion 체력포션 = new portion("체력포션", 100, 5);
		portion 마나포션 = new portion("마나포션", 100, 5);
		character beginner = new character("리무녁", 100, 80, 100, 80, 50, 50, 50, 50, branch, 낡은세트, 체력포션, 마나포션, 달팽이세마리);
		character michael = new character("미하일", 1000, 800, 1000, 800, 150, 150, 150, 150, knight_sword, 초보기사세트, 체력포션,
				마나포션, 베기);
		character souljunior = new character("소울주니어", 800, 1000, 800, 1000, 200, 150, 200, 150, knight_sword, 초보기사세트,
				체력포션, 마나포션, 베기);
		character knghit_michael = new character("기사미하일", 30000, 1500, 30000, 1500, 1000, 700, 1000, 700, knight_blade,
				기사단장세트, 체력포션, 마나포션, 베어가르기);
		character soulsenior = new character("소울시니어", 20000, 2000, 20000, 2000, 1000, 500, 1000, 500, knight_blade,
				기사단장세트, 체력포션, 마나포션, 베어가르기);
		character sword_saint_michael = new character("검성미하일", 100000, 8000, 100000, 8000, 3500, 3000, 3500, 3000,
				sword_saint, 검성세트, 체력포션, 마나포션, 홀리크로스);
		character soulmaster = new character("소울마스터", 100000, 8000, 100000, 8000, 3500, 2500, 3500, 2500, sword_saint,
				검성세트, 체력포션, 마나포션, 홀리크로스);
		monster 피카츄 = new monster("피카츄", "어둠의 피카츄", 350, constant.ph, 350, 100, 50, constant.patk, 100, constant.pdef,
				50);
		monster 람머스 = new monster("람머스", "어둠의 람머스", 5500, 5500, constant.rh, 380, 110, constant.ratk, 300,
				constant.rdef, 110);
		monster 군다 = new monster("군다", "어둠의 군다", 11000, 11000, constant.gh, 1000, 1000, constant.gatk, 1000,
				constant.gdef, 1000);
		monster 디아블로 = new monster("디아블로", "어둠의 디아블로", 100000, 100000, constant.dh, 2000, 2000, constant.datk, 2000,
				constant.ddef, 2000);
		message 메시지 = new message();
		status 상태 = new status();
		battle 연결 = new battle();
		status stat = new status();
		BgmThread pikachuBgm = new BgmThread("C:\\bgm\\pbgm.mp3");
		BgmThread ramausBgm = new BgmThread("C:\\bgm\\rbgm.mp3");
		BgmThread gundaBgm = new BgmThread("C:\\bgm\\gbgm.mp3");
		BgmThread diabloBgm = new BgmThread("C:\\bgm\\dbgm.mp3");
		BgmThread clearBgm = new BgmThread("C:\\bgm\\clear.mp3");
		BgmThread beginerBgm = new BgmThread("C:\\bgm\\bat.mp3");
		BgmThread michaelBgm = new BgmThread("C:\\bgm\\mat.mp3");
		BgmThread michknightBgm = new BgmThread("C:\\bgm\\kat.mp3");
		BgmThread michsaintBgm = new BgmThread("C:\\bgm\\sat.mp3");
		BgmThread monsterBgm = new BgmThread("C:\\bgm\\msat.mp3");
		BgmThread mobdieBgm = new BgmThread("C:\\bgm\\mobdie.mp3");
		BgmThread ding = new BgmThread("C:\\bgm\\ding.mp3");
		BgmThread crazy = new BgmThread("C:\\bgm\\crazy.mp3");
		BgmThread brave = new BgmThread("C:\\bgm\\brave.mp3");
		BgmThread fear = new BgmThread("C:\\bgm\\fear.mp3");
		BgmThread thunder = new BgmThread("C:\\bgm\\thunder.mp3");
		BgmThread breath = new BgmThread("C:\\bgm\\brath.mp3");
		BgmThread sword = new BgmThread("C:\\bgm\\sword.mp3");
		BgmThread rolling = new BgmThread("C:\\bgm\\rolling.mp3");
		Attack attack = new Attack();
		Bloodtime pikachu = new Bloodtime(피카츄);
		Bloodtime ramaus = new Bloodtime(람머스);
		Bloodtime gunda = new Bloodtime(군다);
		Bloodtime diablo = new Bloodtime(디아블로);
		status status = new status();
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		boolean n = random.nextBoolean();
		int i = 0;
		// 여기까지 생성한 인스턴스 들이었습니다.
		// 게임 시작

		System.out.println("게임을 시작하겠습니다.");
		System.out.println("게임을 시작하기 앞서서 게임에 대해서 설명해드리겠습니다.");
		System.out.println("당신은 이 세계에서 몬스터를 잡아 전직을 해야합니다.");
		System.out.println("몬스터를 잡고 나면 전직을 하실 수 있습니다.");
		System.out.println("전직을 하면 더 강한 능력치, 스킬과 장비를 얻으실 수 있습니다.");
		System.out.println("당신은 초보자부터 시작합니다.");
		System.out.println("전직 루트는 두가지 루트가 있습니다.");
		System.out.print("미하일 루트가 있고 ");
		System.out.println("소울마스터 루트가 있습니다.");
		System.out.print("미하일 루트는 ");
		System.out.print("초보자 ");
		System.out.print("- 미하일 ");
		System.out.print("- 기사미하일 ");
		System.out.print("- 검성미하일 ");
		System.out.println("입니다.");
		System.out.print("소울마스터 루트는 ");
		System.out.print("초보자 ");
		System.out.print("- 소울주니어 ");
		System.out.print("- 소울시니어 ");
		System.out.print("- 소울마스터 ");
		System.out.println("입니다.");
		System.out.print("선택창에서 번호를 알려드릴 테니 ");
		System.out.println("원하는 행동은 선택지를 보고 입력하시면 됩니다.");
		System.out.println("그러면 이제 게임을 시작하겠습니다.");
		System.out.println("즐거운 시간 되십시오!");
		System.out.println("\n");
		System.out.println("로딩 중...");
////		 게임 시작 기본 설명이었습니다.
////		 잠깐 텀

		메시지.스토리시작();
		pikachuBgm.start();
		메시지.이동(beginner, 피카츄);
		int cishu = 0;
		int death = 0;
		if (n = true) {
			while (피카츄.hp > 0) {
				메시지.전투창(beginner);
				i = sc.nextInt();
				status.run(beginner, i);
				if (i == 1) {
					cishu++;
					메시지.스킬창(beginner, 달팽이세마리);
					i = sc.nextInt();
					status.run(beginner, i);
					if (i == 1) {
						연결.전투(피카츄, beginner, 달팽이세마리);
						beginerBgm.run();
						연결.마나소모(beginner);
						if (피카츄.hp <= 0) {
							연결.몹사망(피카츄);
							mobdieBgm.run();
							break;
						}
						n = random.nextBoolean();
						if (n = true) {
							연결.전투2(피카츄, beginner);
							monsterBgm.run();
						}
						if (n = false) {
							attack.run(피카츄);
							monsterBgm.run();
						}
						if (cishu == 2) {
							연결.의지(beginner);
							brave.run();
							연결.난동(피카츄);
							crazy.run();
						}
						if (cishu > 2) {
							연결.난동중(피카츄);
							crazy.run();
						}
						if (beginner.hp <= 0) {
							연결.사망(beginner, 피카츄);
							cishu = 0;
							death++;
							연결.dead(피카츄);
							mobdieBgm.run();
							if (death == 2) {
								연결.희망(beginner);
								brave.run();
							}
							continue;
						}
					}
					continue;
				}
				if (i == 2) {
					cishu++;
					메시지.포션();
					메시지.포션표시(체력포션);
					메시지.포션표시2(마나포션);
					ding.run();
					i = sc.nextInt();
					status.run(beginner, i);
					if (i == 1) {
						메시지.체력포션(beginner, 체력포션);
						ding.run();
					}
					if (i == 2) {
						메시지.마나포션(beginner, 마나포션);
						ding.run();
					}
					n = random.nextBoolean();
					if (n = true) {
						연결.전투2(피카츄, beginner);
						monsterBgm.run();
					}
					if (n = false) {
						attack.run(피카츄);
						monsterBgm.run();
					}
					if (beginner.hp <= 0) {
						연결.사망(beginner, 피카츄);
						cishu = 0;
						death++;
						연결.dead(피카츄);
						mobdieBgm.run();
						if (death == 2) {
							연결.희망(beginner);
							brave.run();
						}
						continue;
					}
					continue;
				}
				if(i ==3 || i==4 ) {
					status.run(beginner, i);
					continue;
				}
				if (4 < i || i <= 0) {
					System.out.println("유효하지 않은 접근입니다." + "게임을 다시 시작해주십시오.");
					System.exit(1);
				}
			}
		}
		pikachuBgm.stop();
		메시지.전직(피카츄, beginner);
		i = sc.nextInt();
		status.run(beginner, i);
		if (i == 1) {
			메시지.전직완료(michael);
			System.out.println();
			메시지.이동(michael, 람머스);
			ramausBgm.start();
			cishu = 0;
			death = 0;
			while (람머스.hp > 0) {
				cishu++;
				if (cishu == 2) {
					연결.의지(michael);
					brave.run();
					연결.난동(람머스);
					crazy.run();
				}
				if (cishu > 2) {
					연결.난동중(람머스);
					crazy.run();
				}
				메시지.전투창(michael);
				i = sc.nextInt();
				status.run(michael, i);
				if (i == 1) {
					메시지.스킬창(michael, 베기);
					i = sc.nextInt();
					status.run(michael, i);
					if (i == 1) {
						연결.전투(람머스, michael, 베기);
						연결.마나소모(michael);
						michaelBgm.run();
						if (람머스.hp <= 0) {
							연결.몹사망(람머스);
							mobdieBgm.run();
							break;
						}
						n = random.nextBoolean();
						if (n = true) {
							연결.전투2(람머스, michael);
							monsterBgm.run();
						}
						if (n = false) {
							attack.run(람머스);
							monsterBgm.run();
						}
						if (michael.hp <= 0) {
							연결.사망(michael, 람머스);
							메시지.몹정보(람머스);
							cishu = 0;
							death++;
							연결.dead(람머스);
							mobdieBgm.run();
							if (death == 2) {
								연결.희망(michael);
								brave.run();
							}
							continue;
						}
						continue;
					}
				}
				if (i == 2) {
					메시지.포션();
					메시지.포션표시(체력포션);
					메시지.포션표시2(마나포션);
					i = sc.nextInt();
					status.run(michael, i);
					ding.run();
					if (i == 1) {
						메시지.체력포션(michael, 체력포션);
						ding.run();
					}
					if (i == 2) {
						메시지.마나포션(michael, 마나포션);
						ding.run();
					}
					n = random.nextBoolean();
					if (n = true) {
						연결.전투2(람머스, michael);
						monsterBgm.run();
					}
					if (n = false) {
						attack.run(람머스);
						monsterBgm.run();
					}
					if (michael.hp <= 0) {
						연결.사망(michael, 람머스);
						메시지.몹정보(람머스);
						cishu = 0;
						death++;
						연결.dead(람머스);
						mobdieBgm.run();
						if (death == 2) {
							연결.희망(michael);
							brave.run();
						}
						continue;
					}
					continue;
				}
			}
			메시지.전직(람머스, michael);
			ramausBgm.stop();
			메시지.이동(knghit_michael, 군다);
			gundaBgm.start();
			cishu = 0;
			death = 0;
			while (군다.hp > 0) {
				cishu++;
				if (cishu == 1) {
					연결.공포(knghit_michael);
					fear.run();
				}
				if (cishu == 2) {
					연결.의지(knghit_michael);
					brave.run();
					연결.난동(군다);
					crazy.run();
				}
				if (cishu > 2) {
					연결.난동중(군다);
					crazy.run();
				}
				메시지.전투창(knghit_michael);
				i = sc.nextInt();
				status.run(michael, i);
				if (i == 1) {
					메시지.스킬창(knghit_michael, 베어가르기);
					i = sc.nextInt();
					status.run(knghit_michael, i);
					if (i == 1) {
						연결.전투(군다, knghit_michael, 베어가르기);
						연결.마나소모(knghit_michael);
						michknightBgm.run();
						if (군다.hp <= 0) {

							연결.몹사망(군다);
							mobdieBgm.run();
							break;
						}
						n = random.nextBoolean();
						if (n = true) {
							연결.전투2(군다, knghit_michael);
							monsterBgm.run();
						}
						if (n = false) {
							attack.run(군다);
							monsterBgm.run();
						}
						if (knghit_michael.hp <= 0) {
							연결.사망(knghit_michael, 군다);
							메시지.몹정보(군다);
							cishu = 0;
							death++;
							연결.dead(군다);
							mobdieBgm.run();
							if (death == 2) {
								연결.희망(knghit_michael);
								brave.run();
							}
							continue;
						}
					}
				}
				if (i == 2) {
					메시지.포션();
					메시지.포션표시(체력포션);
					메시지.포션표시2(마나포션);
					i = sc.nextInt();
					status.run(knghit_michael, i);
					ding.run();
					if (i == 1) {
						메시지.체력포션(knghit_michael, 체력포션);
						ding.run();
					}
					if (i == 2) {
						메시지.마나포션(knghit_michael, 마나포션);
						ding.run();
					}
					n = random.nextBoolean();
					if (n = true) {
						연결.전투2(군다, knghit_michael);
						monsterBgm.run();
					}
					if (n = false) {
						attack.run(군다);
						monsterBgm.run();
					}
					if (knghit_michael.hp <= 0) {
						연결.사망(knghit_michael, 군다);
						메시지.몹정보(군다);
						cishu = 0;
						death++;
						연결.dead(군다);
						mobdieBgm.run();
						if (death == 2) {
							연결.희망(knghit_michael);
							brave.run();
						}
						continue;
					}
				}
			}
			gundaBgm.stop();
			메시지.전직(군다, knghit_michael);
			System.out.println();
			메시지.이동(sword_saint_michael, 디아블로);
			diabloBgm.start();
			cishu = 0;
			death = 0;
			while (디아블로.hp > 0) {
				cishu++;
				if (cishu == 2) {
					연결.의지(sword_saint_michael);
					brave.run();
					연결.난동(디아블로);
					crazy.run();
				}
				if (cishu > 2) {
					연결.난동중(디아블로);
					crazy.run();
				}
				if (cishu > 3) {
					연결.도트뎀(sword_saint_michael);
				}
				메시지.전투창(sword_saint_michael);
				i = sc.nextInt();
				status.run(sword_saint_michael, i);
				if (i == 1) {
					메시지.스킬창(sword_saint_michael, 홀리크로스);
					i = sc.nextInt();
					status.run(sword_saint_michael, i);
					if (i == 1) {
						연결.전투(디아블로, sword_saint_michael, 홀리크로스);
						연결.마나소모(sword_saint_michael);
						michsaintBgm.run();
						if (디아블로.hp <= 0) {
							연결.몹사망(디아블로);
							break;
						}
						n = random.nextBoolean();
						if (n = true) {
							연결.전투2(디아블로, sword_saint_michael);
							monsterBgm.run();
						}
						if (n = false) {
							attack.run(디아블로);
							monsterBgm.run();
						}
						if (sword_saint_michael.hp <= 0) {
							연결.사망(sword_saint_michael, 디아블로);
							메시지.몹정보(디아블로);
							cishu = 0;
							death++;
							연결.dead(디아블로);
							mobdieBgm.run();
							if (death == 2) {
								연결.희망(sword_saint_michael);
								brave.run();
							}
							continue;
						}
					}
				}
				if (i == 2) {
					메시지.포션();
					메시지.포션표시(체력포션);
					메시지.포션표시2(마나포션);
					i = sc.nextInt();
					status.run(sword_saint_michael, i);
					ding.run();
					if (i == 1) {
						메시지.체력포션(sword_saint_michael, 체력포션);
						ding.run();
					}
					if (i == 2) {
						메시지.마나포션(sword_saint_michael, 마나포션);
						ding.run();
					}
					n = random.nextBoolean();
					if (n = true) {
						연결.전투2(군다, knghit_michael);
						monsterBgm.run();
					}
					if (n = false) {
						attack.run(군다);
						monsterBgm.run();
					}
					if (sword_saint_michael.hp <= 0) {
						연결.사망(sword_saint_michael, 디아블로);
						메시지.몹정보(디아블로);
						cishu = 0;
						death++;
						연결.dead(디아블로);
						mobdieBgm.run();
						if (death == 2) {
							연결.희망(sword_saint_michael);
							brave.run();
						}
						continue;
					}
				}
				if (cishu == 3) {
					System.out.println("디아블로는 브레스를 뿜었습니다!!!");
					연결.화상(sword_saint_michael);
				}
			}
			diabloBgm.stop();
			clearBgm.start();
			System.out.println("축하합니다!! 디아블로를 무찌르셨습니다!!");
			System.out.println("미하일키우기를 즐겨주셔서 감사합니다!!");
			System.out.println();
			clearBgm.stop();
		}
		if (i == 2) {/// 여기서 부터 소울마스터 루트
			메시지.전직완료(souljunior);
			System.out.println();
			ramausBgm.start();
			메시지.이동(souljunior, 람머스);
			cishu = 0;
			death = 0;
			while (람머스.hp > 0) {
				cishu++;
				if (cishu == 2) {
					연결.의지(souljunior);
					brave.run();
					연결.난동(람머스);
					crazy.run();
				}
				if (cishu > 2) {
					연결.난동중(람머스);
					crazy.run();
				}
				메시지.전투창(souljunior);
				i = sc.nextInt();
				status.run(souljunior, i);
				if (i == 1) {
					메시지.스킬창(souljunior, 베기);
					i = sc.nextInt();
					status.run(souljunior, i);
					if (i == 1) {
						연결.전투(람머스, souljunior, 베기);
						연결.마나소모(souljunior);
						michaelBgm.run();
						if (람머스.hp <= 0) {
							연결.몹사망(람머스);
							break;
						}
						n = random.nextBoolean();
						if (n = true) {
							연결.전투2(람머스, souljunior);
							monsterBgm.run();
						}
						if (n = false) {
							attack.run(람머스);
							monsterBgm.run();
						}
						if (souljunior.hp <= 0) {
							연결.사망(souljunior, 람머스);
							메시지.몹정보(람머스);
							cishu = 0;
							death++;
							연결.dead(람머스);
							mobdieBgm.run();
							if (death == 2) {
								연결.희망(souljunior);
								brave.run();
							}
							continue;
						}
					}
				}
				if (i == 2) {

					메시지.포션();
					메시지.포션표시(체력포션);
					메시지.포션표시2(마나포션);
					i = sc.nextInt();
					status.run(souljunior, i);
					ding.run();
					if (i == 1) {
						메시지.체력포션(souljunior, 체력포션);
						ding.run();
					}
					if (i == 2) {
						메시지.마나포션(souljunior, 마나포션);
						ding.run();
					}
					n = random.nextBoolean();
					if (n = true) {
						연결.전투2(람머스, souljunior);
						monsterBgm.run();
					}
					if (n = false) {
						attack.run(람머스);
						monsterBgm.run();
					}
					if (souljunior.hp <= 0) {
						연결.사망(souljunior, 람머스);
						메시지.몹정보(람머스);
						cishu = 0;
						death++;
						연결.dead(람머스);
						mobdieBgm.run();
						if (death == 2) {
							연결.희망(souljunior);
							brave.run();
						}
						continue;
					}
				}
			}
			ramausBgm.stop();
			메시지.전직(람머스, souljunior);
			메시지.전직완료(soulsenior);
			System.out.println();
			gundaBgm.start();
			메시지.이동(soulsenior, 군다);
			cishu = 0;
			death = 0;
			while (군다.hp > 0) {
				cishu++;
				if (cishu == 1) {
					연결.공포(soulsenior);
					fear.run();
				}
				if (cishu == 2) {
					연결.의지(soulsenior);
					연결.난동(군다);
					crazy.run();
				}
				if (cishu > 2) {
					연결.난동중(군다);
					crazy.run();
				}
				메시지.전투창(soulsenior);
				status.run(soulsenior, i);
				if (i == 1) {
					메시지.스킬창(soulsenior, 베어가르기);
					i = sc.nextInt();
					status.run(soulsenior, i);
					if (i == 1) {
						연결.전투(군다, soulsenior, 베어가르기);
						연결.마나소모(soulsenior);
						michknightBgm.run();
						if (군다.hp <= 0) {
							연결.몹사망(군다);
							break;
						}
						n = random.nextBoolean();
						if (n = true) {
							연결.전투2(군다, soulsenior);
							monsterBgm.run();
						}
						if (n = false) {
							attack.run(군다);
							monsterBgm.run();
						}
						if (soulsenior.hp <= 0) {
							연결.사망(soulsenior, 군다);
							메시지.몹정보(군다);
							cishu = 0;
							death++;
							연결.dead(군다);
							mobdieBgm.run();
							if (death == 2) {
								연결.희망(soulsenior);
								brave.run();
							}
							continue;
						}
					}
				}
				if (i == 2) {
					메시지.포션();
					메시지.포션표시(체력포션);
					메시지.포션표시2(마나포션);
					i = sc.nextInt();
					status.run(soulsenior, i);
					ding.run();
					if (i == 1) {
						메시지.체력포션(soulsenior, 체력포션);
						ding.run();
					}
					if (i == 2) {
						메시지.마나포션(soulsenior, 마나포션);
						ding.run();
					}
					n = random.nextBoolean();
					if (n = true) {
						연결.전투2(군다, soulsenior);
						monsterBgm.run();
					}
					if (n = false) {
						attack.run(군다);
						monsterBgm.run();
					}
					if (soulsenior.hp <= 0) {
						연결.사망(soulsenior, 군다);
						메시지.몹정보(군다);
						cishu = 0;
						death++;
						연결.dead(군다);
						mobdieBgm.run();
						if (death == 2) {
							연결.희망(soulsenior);
							brave.run();
						}
						continue;
					}
				}
			}
			gundaBgm.stop();
			메시지.전직(군다, soulsenior);
			메시지.전직완료(soulmaster);
			System.out.println();
			diabloBgm.start();
			메시지.이동(soulmaster, 디아블로);
			cishu = 0;
			death = 0;
			while (디아블로.hp > 0) {
				cishu++;
				if (cishu == 2) {
					System.out.println("디아블로는 브레스를 뿜었습니다!!!");
					연결.화상(soulmaster);
					breath.run();
				}
				if (cishu == 2) {
					연결.의지(soulmaster);
					brave.run();
					연결.난동(디아블로);
					crazy.run();
				}
				if (cishu > 2) {
					연결.난동중(디아블로);
					crazy.run();
				}
				if (cishu > 2) {
					연결.도트뎀(soulmaster);
				}
				메시지.전투창(soulmaster);
				i = sc.nextInt();
				status.run(soulmaster, i);
				if (i == 1) {
					메시지.스킬창(soulmaster, 홀리크로스);
					i = sc.nextInt();
					status.run(soulmaster, i);
					if (i == 1) {
						연결.전투(디아블로, soulmaster, 홀리크로스);
						연결.마나소모(soulmaster);
						michsaintBgm.run();
						if (디아블로.hp <= 0) {
							연결.몹사망(디아블로);
							break;
						}
						n = random.nextBoolean();
						if (n = true) {
							연결.전투2(디아블로, soulmaster);
							monsterBgm.run();
						}
						if (n = false) {
							attack.run(디아블로);
							monsterBgm.run();
						}
						if (soulmaster.hp <= 0) {
							연결.사망(soulmaster, 디아블로);
							메시지.몹정보(디아블로);
							cishu = 0;
							death++;
							연결.dead(디아블로);
							mobdieBgm.run();
							if (death == 2) {
								연결.희망(soulmaster);
								brave.run();
							}
							continue;
						}
					}
				}
				if (i == 2) {
					메시지.포션();
					메시지.포션표시(체력포션);
					메시지.포션표시2(마나포션);
					ding.run();
					i = sc.nextInt();
					status.run(soulmaster, i);
					if (i == 1) {
						메시지.체력포션(soulmaster, 체력포션);
						ding.run();
					}
					if (i == 2) {
						메시지.마나포션(soulmaster, 마나포션);
						ding.run();
					}
					if (cishu == 2) {
						System.out.println("디아블로는 브레스를 뿜었습니다!!!");
						연결.화상(soulmaster);
						breath.run();
					}
					n = random.nextBoolean();
					if (n = true) {
						연결.전투2(디아블로, soulmaster);
						monsterBgm.run();
					}
					if (n = false) {
						attack.run(디아블로);
						monsterBgm.run();
					}
					if (soulmaster.hp <= 0) {
						연결.사망(soulmaster, 디아블로);
						메시지.몹정보(디아블로);
						cishu = 0;
						death++;
						연결.dead(디아블로);
						mobdieBgm.run();
						if (death == 2) {
							연결.희망(soulmaster);
							brave.run();
						}
						continue;
					}
				}

			}
			diabloBgm.stop();
			clearBgm.start();
			System.out.println("축하합니다!! 디아블로를 무찌르셨습니다!!");
			System.out.println("미하일키우기를 즐겨주셔서 감사합니다!!");
			System.out.println();
			clearBgm.stop();
		}
		sc.close();
	}
}
