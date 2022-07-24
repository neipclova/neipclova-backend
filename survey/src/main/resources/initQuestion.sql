-- 1
INSERT INTO public.question(
    image_uri, question, question_order, survey_type)
VALUES
    (null, '{"student":"당신은 학생입니까 직장인입니까?", "worker": "당신은 학생입니까 직장인입니까?"}', 1, 'CLUB'),
    (null, '{"student":"등교 시간을 어떻게 정하는가?", "worker": "출근 시간을 어떻게 정하는가?"}', 2, 'CLUB'),
    (null, '{"student":"등교길에 친구의 뒷모습이 보인다", "worker": "출근길에 동료의 뒷모습이 보인다"}', 3, 'CLUB'),
    (null, '{"student":"반갑게 인사한 직후 돌부리에 걸려 크게 넘어졌다", "worker": "반갑게 인사한 직후 돌부리에 걸려 크게 넘어졌다"}', 4, 'CLUB'),
    (null, '{"student":"친구가 갑자기 뒤돌아봐서 깜짝 놀란 나머지,<br>아이쿠! 돌부리에 걸려 크게 넘어저벼렸다.", "worker": "동료가 갑자기 뒤돌아봐서 깜짝 놀란 나머지,<br>아이쿠! 돌부리에 걸려 크게 넘어저벼렸다."}', 5, 'CLUB'),
    (null, '{"student":"나는 등교하자마자..", "worker": "나는 출근하자마자.."}', 6, 'CLUB'),
    (null, '{"student":"수업시간에 복잡한 과제를 받았는데..<br>\"혹시 질문있나?\" 교수님이 묻는다", "worker": "요구사항이 수두룩한 새로운 업무를 받았는데..<br>“혹시 다 이해하셨나요?” 상사가 묻는다"}', 7, 'CLUB'),
    (null, '{"student":"점심시간이다! 친구가 뜨끈한 순대국밥 먹자고 한다.<br>근데 오늘은 별로 안 땡기네..", "worker": "점심시간이다! 상사가 뜨끈한 순대국밥 먹자고 한다.<br>근데 오늘은 별로 안 땡기네.."}', 8, 'CLUB'),
    (null, '{"student":"음식점에서 노래가 흘러나온다.<br>흔들리는 꽃들 속에서~ 네 샴푸향이 느껴진거야", "worker": "음식점에서 노래가 흘러나온다.<br>흔들리는 꽃들 속에서~ 네 샴푸향이 느껴진거야"}', 9, 'CLUB'),
    (null, '{"student":"친구들이랑 밥 먹고 후식으로 자판기음료를 마시려고 한다<br>거기서 나는", "worker": "동료들과 밥 먹고 후식으로 자판기음료를 마시려고 한다<br>거기서 나는"}', 10, 'CLUB'),
    (null, '{"student":"가위바위보했는데 내가 졌다.. 친구가 펩시로 주문하면서 \"역시 콜라는 펩시지\"라고 한다", "worker": "가위바위보했는데 내가 졌다.. 동료가 펩시로 주문하면서 \"역시 콜라는 펩시죠\"라고 한다"}', 11, 'CLUB'),
    (null, '{"student":"오늘은 내가 사는 날! 친구가 펩시로 주문하면서 \"역시 콜라는 펩시지\"라고 한다", "worker": "오늘은 내가 사는 날! 동료가 펩시로 주문하면서 \"역시 콜라는 펩시죠\"라고 한다"}', 12, 'CLUB'),
    (null, '{"student":"음료수를 먹으며 창문을 바라본다. 오늘 참 멍때리기 좋은 날씨네...", "worker": "음료수를 먹으며 창문을 바라본다. 오늘 참 멍때리기 좋은 날씨네..."}', 13, 'CLUB'),
    (null, '{"student":"오후 팀플시간이다. 팀플하면서 나랑 다른 의견을 낸 친구가 있는데 의견이 마음에 안 든다. 내 대처는?", "worker": "오후 회의시간이다. 회의 중에 나랑 다른 의견을 낸 동료가 있는데 의견이 마음에 안 든다. 내 대처는?"}', 14, 'CLUB'),
    (null, '{"student":"수업 중 잠깐 카톡 타임~ 엇 그런데 오늘 생일인 친구 목록에 지금 같이 수업듣는 친구가 떴다!", "worker": "업무 중 잠깐 카톡 타임~ 엇 그런데 오늘 생일인 친구 목록에 회사 동료가 떴다!"}', 15, 'CLUB'),
    (null, '{"student":"과제 발표시간이다. 발표 중에 교수님이 추가 설명을 요청했다. 설명 방식은?", "worker": "보고서 발표시간이다. 발표 중에 팀장님이 추가 설명을 요청했다. 설명 방식은?"}', 16, 'CLUB'),
    (null, '{"student":"교수님이 톡방에 \"아몬드가 죽으면? 다이아몬드💎️\"라고 올렸다. 나의 답변은?", "worker": "상사가 톡방에 \"아몬드가 죽으면? 다이아몬드💎\"라고 올렸다. 나의 답변은?"}', 17, 'CLUB'),
    (null, '{"student":"교수님한테서 오늘 중대 발표가 있다고 연락이 왔다", "worker": "부장님한테서 오늘 중대 발표가 있다고 연락이 왔다"}', 18, 'CLUB'),
    (null, '{"student":"같이 수업듣는 친한 친구가 갑자기 철회할거라고 한다", "worker": "친한 직장동료가 갑자기 퇴사할거라고 한다"}', 19, 'CLUB'),
    (null, '{"student":"하교길.. 덜 친한 친구가 자기 부모님이 태워주시니 같이 가자고 한다", "worker": "퇴근길.. 집 방향이 같은 사수가 태워주겠다고 한다"}', 20, 'CLUB');