import java.io.File;
import java.util.Scanner;

public class game {
    static char key = 'a';
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
        character michael = new character("미하일", 1000, 800, 1000, 800, 150, 150, 150, 150, knight_sword, 초보기사세트, 체력포션, 마나포션,
                베기);
        character souljunior = new character("소울주니어", 800, 1000, 800, 1000, 200, 150, 200, 150, knight_sword, 초보기사세트, 체력포션,
                마나포션, 베기);
        character knghit_michael = new character("기사미하일", 30000, 1500, 30000, 1500, 1000, 700, 1000, 700, knight_blade, 기사단장세트,
                체력포션, 마나포션, 베어가르기);
        character soulsenior = new character("소울시니어", 20000, 2000, 20000, 2000, 1000, 500, 1000, 500, knight_blade, 기사단장세트,
                체력포션, 마나포션, 베어가르기);
        character sword_saint_michael = new character("검성미하일", 100000, 8000, 100000, 8000, 3500, 3000, 3500, 3000, sword_saint,
                검성세트, 체력포션, 마나포션, 홀리크로스);
        character soulmaster = new character("소울마스터", 100000, 8000, 100000, 8000, 3500, 2500, 3500, 2500, sword_saint, 검성세트,
                체력포션, 마나포션, 홀리크로스);
        monster 피카츄 = new monster("피카츄", 350, constant.ph, 100, 50, constant.patk, constant.pdef);
        monster 람머스 = new monster("람머스", 5500, constant.rh, 380, 110, constant.ratk, constant.rdef);
        monster 군다 = new monster("군다", 11000, constant.gh, 1000, 1000, constant.gatk, constant.gdef);
        monster 디아블로 = new monster("디아블로", 100000, constant.dh, 2000, 2000, constant.datk, constant.ddef);
        message 메시지 = new message();

        status 상태 = new status();
        battle 연결 = new battle();
        status stat = new status();
        bgm sound = new bgm();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        // 여기까지 생성한 인스턴스 들이었습니다.

        // 게임 시작
//        System.out.println("게임을 시작하겠습니다.");
//        try {
//            Thread.sleep(500);
//            System.out.println("게임을 시작하기 앞서서 게임에 대해서 설명해드리겠습니다.");
//            Thread.sleep(500);
//            System.out.println("당신은 이 세계에서 몬스터를 잡아 전직을 해야합니다.");
//            Thread.sleep(500);
//            System.out.println("몬스터를 잡고 나면 전직을 하실 수 있습니다.");
//            Thread.sleep(500);
//            System.out.println("전직을 하면 더 강한 능력치, 스킬과 장비를 얻으실 수 있습니다.");
//            Thread.sleep(500);
//            System.out.println("당신은 초보자부터 시작합니다.");
//            Thread.sleep(500);
//            System.out.println("전직 루트는 두가지 루트가 있습니다.");
//            Thread.sleep(500);
//            System.out.print("미하일 루트가 있고 ");
//            Thread.sleep(500);
//            System.out.println("소울마스터 루트가 있습니다.");
//            Thread.sleep(500);
//            System.out.print("미하일 루트는 ");
//            Thread.sleep(500);
//            System.out.print("초보자 ");
//            Thread.sleep(500);
//            System.out.print("- 미하일 ");
//            Thread.sleep(500);
//            System.out.print("- 기사미하일 ");
//            Thread.sleep(500);
//            System.out.print("- 검성미하일 ");
//            Thread.sleep(500);
//            System.out.println("입니다.");
//            Thread.sleep(500);
//            System.out.print("소울마스터 루트는 ");
//            Thread.sleep(500);
//            System.out.print("초보자 ");
//            Thread.sleep(500);
//            System.out.print("- 소울주니어 ");
//            Thread.sleep(500);
//            System.out.print("- 소울시니어 ");
//            Thread.sleep(500);
//            System.out.print("- 소울마스터 ");
//            Thread.sleep(500);
//            System.out.println("입니다.");
//            Thread.sleep(500);
//            System.out.print("선택창에서 번호를 알려드릴 테니 ");
//            Thread.sleep(500);
//            System.out.println("원하는 행동은 선택지를 보고 입력하시면 됩니다.");
//            Thread.sleep(500);
//            System.out.println("그러면 이제 게임을 시작하겠습니다.");
//            Thread.sleep(500);
//            System.out.println("즐거운 시간 되십시오!");
//            System.out.println("\n");
//            System.out.println("로딩 중...");
//        } catch (InterruptedException e) {
//        }
//		 게임 시작 기본 설명이었습니다.
//		 잠깐 텀
//        try {
//            Thread.sleep(2000);
//            메시지.스토리시작();
//            Thread.sleep(1000);
//            메시지.이동(beginner, 피카츄);
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//        }
        int cishu = 0;
        int death = 0;
        while (피카츄.hp > 0) {
            cishu++;
            if (cishu == 2) {
                연결.의지(beginner);
                연결.난동(피카츄);
            }
            if (cishu > 2) {
                연결.난동중(피카츄);
            }
            메시지.전투창(beginner);
            i = sc.nextInt();
            if (i == 1) {
                메시지.스킬창(beginner, 달팽이세마리);
                i = sc.nextInt();
                if (i == 1) {
                    연결.전투(피카츄, beginner, 달팽이세마리);
                    연결.마나소모(beginner);
                    if (피카츄.hp <= 0) {
                        연결.몹사망(피카츄);
                        break;
                    }
                    try {
                        Thread.sleep(1000);
                        연결.전투2(피카츄, beginner);
                        Thread.sleep(1000);
                        if (beginner.hp <= 0) {
                            연결.사망(beginner, 피카츄);
                            cishu = 0;
                            death++;
                            연결.dead(피카츄);
                            if (death == 2) {
                                연결.희망(beginner);
                            }
                            continue;
                        }
                    } catch (InterruptedException e) {
                    }
                }
                continue;
            }
            if (i == 2) {
                메시지.포션();
                메시지.포션표시(체력포션);
                메시지.포션표시2(마나포션);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.체력포션(beginner, 체력포션);
                }
                if (i == 2) {
                    메시지.마나포션(beginner, 마나포션);
                }
                연결.전투2(피카츄, beginner);
                if (beginner.hp <= 0) {
                    연결.사망(beginner, 피카츄);
                    cishu = 0;
                    death++;
                    연결.dead(피카츄);
                    if (death == 2) {
                        연결.희망(beginner);
                    }
                    continue;
                }
                continue;
            } else {
                System.out.println("유효하지 않은 접근입니다.");
                System.exit(1);
            }
        }
        메시지.전직(피카츄, beginner);
        i = sc.nextInt();
        if (i == 1) {
            메시지.전직완료(michael);
            System.out.println();
            try {
                Thread.sleep(1000);
                메시지.이동(michael, 람머스);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cishu = 0;
            death = 0;
            while (람머스.hp > 0) {
                cishu++;
                if (cishu == 2) {
                    연결.의지(michael);
                    연결.난동(람머스);
                }
                if (cishu > 2) {
                    연결.난동중(람머스);
                }
                메시지.전투창(michael);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(michael, 베기);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(람머스, michael, 베기);
                        연결.마나소모(michael);
                        if (람머스.hp <= 0) {
                            연결.몹사망(람머스);
                            break;
                        }
                        try {
                            Thread.sleep(1000);
                            연결.전투2(람머스, michael);
                            Thread.sleep(1000);
                            if (michael.hp <= 0) {
                                연결.사망(michael, 람머스);
                                메시지.몹정보(람머스);
                                cishu = 0;
                                death++;
                                연결.dead(람머스);
                                if (death == 2) {
                                    연결.희망(michael);
                                }
                                continue;
                            }
                            continue;
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    메시지.포션표시(체력포션);
                    메시지.포션표시2(마나포션);
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(michael, 체력포션);
                    }
                    if (i == 2) {
                        메시지.마나포션(michael, 마나포션);
                    }
                    try {
                        연결.전투2(람머스, michael);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    if (michael.hp <= 0) {
                        연결.사망(michael, 람머스);
                        메시지.몹정보(람머스);
                        cishu = 0;
                        death++;
                        연결.dead(람머스);
                        if (death == 2) {
                            연결.희망(michael);
                        }
                        continue;
                    }
                    continue;
                }
            }
            메시지.전직(람머스, michael);
            메시지.이동(knghit_michael, 군다);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cishu = 0;
            death = 0;
            while (군다.hp > 0) {
                cishu++;
                if (cishu == 1) {
                    연결.공포(knghit_michael);
                }
                if (cishu == 2) {
                    연결.의지(knghit_michael);
                    연결.난동(군다);
                }
                if (cishu > 2) {
                    연결.난동중(군다);
                }
                메시지.전투창(knghit_michael);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(knghit_michael, 베어가르기);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(군다, knghit_michael, 베어가르기);
                        연결.마나소모(knghit_michael);
                        if (군다.hp <= 0) {
                            연결.몹사망(군다);
                            break;
                        }
                        try {
                            Thread.sleep(1000);
                            연결.전투2(군다, knghit_michael);
                            Thread.sleep(1000);
                            if (knghit_michael.hp <= 0) {
                                연결.사망(knghit_michael, 군다);
                                메시지.몹정보(군다);
                                cishu = 0;
                                death++;
                                연결.dead(군다);
                                if (death == 2) {
                                    연결.희망(knghit_michael);
                                }
                                continue;
                            }
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    메시지.포션표시(체력포션);
                    메시지.포션표시2(마나포션);
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(knghit_michael, 체력포션);
                    }
                    if (i == 2) {
                        메시지.마나포션(knghit_michael, 마나포션);
                    }
                    try {
                        연결.전투2(군다, knghit_michael);
                        Thread.sleep(1000);
                        if (knghit_michael.hp <= 0) {
                            연결.사망(knghit_michael, 군다);
                            메시지.몹정보(군다);
                            cishu = 0;
                            death++;
                            연결.dead(군다);
                            if (death == 2) {
                                연결.희망(knghit_michael);
                            }
                            continue;
                        }
                    } catch (InterruptedException e) {
                    }
                }
            }
            메시지.전직(군다, knghit_michael);
            System.out.println();
            try {
                Thread.sleep(1000);
                메시지.이동(sword_saint_michael, 디아블로);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cishu = 0;
            death = 0;
            while (디아블로.hp > 0) {
                cishu++;
                if (cishu == 2) {
                    연결.의지(sword_saint_michael);
                    연결.난동(디아블로);
                }
                if (cishu > 2) {
                    연결.난동중(디아블로);
                }
                if (cishu > 3) {
                    연결.도트뎀(sword_saint_michael);
                }
                메시지.전투창(sword_saint_michael);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(sword_saint_michael, 홀리크로스);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(디아블로, sword_saint_michael, 홀리크로스);
                        연결.마나소모(sword_saint_michael);
                        if (디아블로.hp <= 0) {
                            연결.몹사망(디아블로);
                            break;
                        }
                        try {
                            Thread.sleep(1000);
                            연결.전투2(디아블로, sword_saint_michael);
                            Thread.sleep(1000);
                            if (sword_saint_michael.hp <= 0) {
                                연결.사망(sword_saint_michael, 디아블로);
                                메시지.몹정보(디아블로);
                                cishu = 0;
                                death++;
                                연결.dead(디아블로);
                                if (death == 2) {
                                    연결.희망(sword_saint_michael);
                                }
                                continue;
                            }
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    메시지.포션표시(체력포션);
                    메시지.포션표시2(마나포션);
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(sword_saint_michael, 체력포션);
                    }
                    if (i == 2) {
                        메시지.마나포션(sword_saint_michael, 마나포션);
                    }
                    try {
                        연결.전투2(디아블로, sword_saint_michael);
                        Thread.sleep(1000);
                        if (sword_saint_michael.hp <= 0) {
                            연결.사망(sword_saint_michael, 디아블로);
                            메시지.몹정보(디아블로);
                            cishu = 0;
                            death++;
                            연결.dead(디아블로);
                            if (death == 2) {
                                연결.희망(sword_saint_michael);
                            }
                            continue;
                        }
                    } catch (InterruptedException e) {
                    }
                }
                if (cishu == 3) {
                    System.out.println("디아블로는 브레스를 뿜었습니다!!!");
                    연결.화상(sword_saint_michael);
                }
            }
            System.out.println("축하합니다!! 디아블로를 무찌르셨습니다!!");
            System.out.println("미하일키우기를 즐겨주셔서 감사합니다!!");
            System.out.println();
        }
        if (i == 2) {///여기서 부터 소울마스터 루트
            메시지.전직완료(souljunior);
            System.out.println();
            try {
                Thread.sleep(1000);
                메시지.이동(souljunior, 람머스);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cishu = 0;
            death = 0;
            while (람머스.hp > 0) {
                cishu++;
                if (cishu == 2) {
                    연결.의지(souljunior);
                    연결.난동(람머스);
                }
                if (cishu > 2) {
                    연결.난동중(람머스);
                }
                메시지.전투창(souljunior);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(souljunior, 베기);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(람머스, souljunior, 베기);
                        연결.마나소모(souljunior);
                        if (람머스.hp <= 0) {
                            연결.몹사망(람머스);
                            break;
                        }
                        try {
                            Thread.sleep(1000);
                            연결.전투2(람머스, souljunior);
                            Thread.sleep(1000);
                            if (souljunior.hp <= 0) {
                                연결.사망(souljunior, 람머스);
                                메시지.몹정보(람머스);
                                cishu = 0;
                                death++;
                                연결.dead(람머스);
                                if (death == 2) {
                                    연결.희망(souljunior);
                                }
                                continue;
                            }
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    메시지.포션표시(체력포션);
                    메시지.포션표시2(마나포션);
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(souljunior, 체력포션);
                    }
                    if (i == 2) {
                        메시지.마나포션(souljunior, 마나포션);
                    }
                    try {
                        Thread.sleep(1000);
                        연결.전투2(람머스, souljunior);
                        Thread.sleep(1000);
                        if (souljunior.hp <= 0) {
                            연결.사망(souljunior, 람머스);
                            메시지.몹정보(람머스);
                            cishu = 0;
                            death++;
                            연결.dead(람머스);
                            if (death == 2) {
                                연결.희망(souljunior);
                            }
                            continue;
                        }
                    } catch (InterruptedException e) {
                    }
                }
            }
            메시지.전직(람머스, souljunior);
            메시지.전직완료(soulsenior);
            System.out.println();
            try {
                Thread.sleep(1000);
                메시지.이동(soulsenior, 군다);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cishu = 0;
            death = 0;
            while (군다.hp > 0) {
                cishu++;
                if (cishu == 1) {
                    연결.공포(soulsenior);
                }
                if (cishu == 2) {
                    연결.의지(soulsenior);
                    연결.난동(군다);
                }
                if (cishu > 2) {
                    연결.난동중(군다);
                }
                메시지.전투창(soulsenior);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(soulsenior, 베어가르기);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(군다, soulsenior, 베어가르기);
                        연결.마나소모(soulsenior);
                        if (군다.hp <= 0) {
                            연결.몹사망(군다);
                            break;
                        }
                        try {
                            Thread.sleep(1000);
                            연결.전투2(군다, soulsenior);
                            Thread.sleep(1000);
                            if (soulsenior.hp <= 0) {
                                연결.사망(soulsenior, 군다);
                                메시지.몹정보(군다);
                                cishu = 0;
                                death++;
                                연결.dead(군다);
                                if (death == 2) {
                                    연결.희망(soulsenior);
                                }
                                continue;
                            }
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    메시지.포션표시(체력포션);
                    메시지.포션표시2(마나포션);
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(soulsenior, 체력포션);
                    }
                    if (i == 2) {
                        메시지.마나포션(soulsenior, 마나포션);
                    }
                    try {
                        Thread.sleep(1000);
                        연결.전투2(군다, soulsenior);
                        Thread.sleep(1000);
                        if (soulsenior.hp <= 0) {
                            연결.사망(soulsenior, 군다);
                            메시지.몹정보(군다);
                            cishu = 0;
                            death++;
                            연결.dead(군다);
                            if (death == 2) {
                                연결.희망(soulsenior);
                            }
                            continue;
                        }
                    } catch (InterruptedException e) {
                    }
                }
            }
            메시지.전직(군다, soulsenior);
            메시지.전직완료(soulmaster);
            System.out.println();
            try {
                Thread.sleep(1000);
                메시지.이동(soulmaster, 디아블로);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cishu = 0;
            death = 0;
            while (디아블로.hp > 0) {
                cishu++;
                if (cishu == 2) {
                    연결.의지(soulmaster);
                    연결.난동(디아블로);
                }
                if (cishu > 2) {
                    연결.난동중(디아블로);
                }
                if (cishu > 3) {
                    연결.도트뎀(soulmaster);
                }
                메시지.전투창(soulmaster);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(soulmaster, 홀리크로스);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(디아블로, soulmaster, 홀리크로스);
                        연결.마나소모(soulmaster);
                        if (디아블로.hp <= 0) {
                            연결.몹사망(디아블로);
                            break;
                        }
                        try {
                            Thread.sleep(1000);
                            연결.전투2(디아블로, soulmaster);
                            Thread.sleep(1000);
                            if (soulmaster.hp <= 0) {
                                연결.사망(soulmaster, 디아블로);
                                메시지.몹정보(디아블로);
                                cishu = 0;
                                death++;
                                연결.dead(디아블로);
                                if (death == 2) {
                                    연결.희망(soulmaster);
                                }
                                continue;
                            }
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    메시지.포션표시(체력포션);
                    메시지.포션표시2(마나포션);
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(soulmaster, 체력포션);
                    }
                    if (i == 2) {
                        메시지.마나포션(soulmaster, 마나포션);
                    }
                    try {
                        Thread.sleep(1000);
                        연결.전투2(디아블로, soulmaster);
                        Thread.sleep(1000);
                        if (soulmaster.hp <= 0) {
                            연결.사망(soulmaster, 디아블로);
                            메시지.몹정보(디아블로);
                            cishu = 0;
                            death++;
                            연결.dead(디아블로);
                            if (death == 2) {
                                연결.희망(soulmaster);
                            }
                            continue;
                        }
                    } catch (InterruptedException e) {
                    }
                }
                if (cishu == 3) {
                    System.out.println("디아블로는 브레스를 뿜었습니다!!!");
                    연결.화상(soulmaster);
                }
            }
            System.out.println("축하합니다!! 디아블로를 무찌르셨습니다!!");
            System.out.println("미하일키우기를 즐겨주셔서 감사합니다!!");
            System.out.println();
        }
    }
}

