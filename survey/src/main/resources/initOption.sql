-- 1
INSERT INTO public.option(
    option_order, option, mbti_type, question_id, next_question_id)
VALUES
    (1, '학생', NULL, 1, 2),
    (2, '직장인', NULL, 1, 2),
    (1, '지하철 타고 버스 환승 한 번이니 거의 40분이겠군', 'P', 2, 3),
    (2, '8시 5분에 출발하는 열차를 타기 위해선 10분전에 출발해야겠군', 'J', 2, 3),
    (1, '먼저 다가가서 인사한다', 'E', 3, 4),
    (2, '행여 마주칠까 걸음 속도를 더 낮춘다', 'I', 3, 5),
    (1, '<b>아씨 아파라~ 뭐야 이건!</b> 괜히 큰소리 친다', 'T', 4, 6),
    (2, '바로 일어나서 아무렇지 않게 말을 건다', 'F', 4, 6),
    (1, '<b>아씨 아파라~ 뭐야 이건!</b> 괜히 큰소리 친다', 'T', 5, 6),
    (2, '바로 일어나서 아무렇지 않게 인사한다', 'F', 5, 6),
    (1, '책상 앞 플래너를 펼친다', 'J', 6, 7),
    (2, '오늘 뭘 해야 할지 여기저기 찾아보며 고민한다', 'P', 6, 7),
    (1, '더 말 나오기 전에 STOP. 방향은 알겠으니 일단 넘어간다', 'N', 7, 8),
    (2, '이해안가는 부분이 있으니 물어본다. "이 부분은 이렇게 구현하면 될까요?"', 'S', 7, 8),
    (1, '그래도 그냥 따라간다', 'P', 8, 9),
    (2, '내가 먹고 싶은 메뉴로 은근히 어필한다', 'J', 8, 9),
    (1, '멜로디가 좋네~ 따라부른다', 'S', 9, 10),
    (2, '와 나도 꽃향 샴푸 써보고 싶다', 'N', 9, 10),
    (1, '가위바위보로 내기를 제안한다', 'T', 10, 11),
    (2, '저번엔 얻어먹었으니 이번엔 내가 산다고 한다', 'F', 10, 12),
    (1, '이게 미쳤나 코카콜라지. 누가 펩시를 콜라로 쳐..라고 생각한다', 'T', 11, 13),
    (2, '그런가 펩시도 맛있나? 라고 생각한다', 'F', 11, 13),
    (1, '이게 미쳤나 코카콜라지. 누가 펩시를 콜라로 쳐..라고 생각한다', 'T', 12, 13),
    (2, '그런가 펩시도 맛있나? 라고 생각한다', 'F', 12, 13),
    (1, '아 저녁에 뭐먹지? 딴 생각한다', 'N', 13, 14),
    (2, 'O.O........', 'S', 13, 14),
    (1, '논리적으로 왜 마음에 안 드는지 설명한다', 'T', 14, 15),
    (2, '반박하면 분위기가 안 좋아질 것 같아 일단 넘어간다', 'F', 14, 15),
    (1, '다른 사람이 축하해 줄 때까지 기다린다', 'I', 15, 16),
    (2, '보자마자 단톡방에서 생일을 축하해준다', 'E', 15, 16),
    (1, '적절한 비유와 예시를 기반으로 설명한다', 'N', 16, 17),
    (2, '뒷받침할만 객관적 지표나 자료룰 기반으로 설명한다', 'S', 16, 17),
    (1, 'ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 바로 ㅋ부터 친다', 'E', 17, 18),
    (2, '내가 쓸 답변을 읽고 또 읽고, 고치고 또 고친다..', 'I', 17, 18),
    (1, '할 게 많아지려나? 불안감에 휩싸인다', 'S', 18, 19),
    (2, '결혼하시나?', 'N', 18, 19),
    (1, '놀라서 언제부터 그만할거냐고 물어본다', 'T', 19, 20),
    (2, '놀라서 무슨 일 있냐고 물어본다', 'F', 19, 20),
    (1, '집 편하게 갈 생각에 싱글벙글하다', 'E', 20, NULL),
    (2, '없는 약속을 만들어낸다', 'I', 20, NULL);
