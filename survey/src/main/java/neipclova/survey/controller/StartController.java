package neipclova.survey.controller;

import neipclova.survey.domain.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import spring.Hwaxby_back.domain.Ask;
//import spring.Hwaxby_back.domain.Coordinates;
//import spring.Hwaxby_back.domain.Voice;
//import spring.Hwaxby_back.repository.CoordRepository;
//import spring.Hwaxby_back.repository.VoiceRepository;
//import spring.Hwaxby_back.service.CoordService;
//import spring.Hwaxby_back.service.MemberService;
//import spring.Hwaxby_back.service.VoiceService;

@Controller
public class StartController {

//    private final VoiceService voiceService;
//    private final CoordService coordService;
//
//    @Autowired
//    public AskController(VoiceService voiceService, CoordService coordService) {
//        this.voiceService = voiceService;
//        this.coordService = coordService;
//    }

    @PostMapping("start")
    public ResponseEntity<?> getVisitorID(@RequestBody Visitor visitor) throws Exception {
        Long visitor_id = visitor.getId();
        return new ResponseEntity<> (visitor_id, HttpStatus.OK);
//
//        Voice voice = new Voice();
//        voice.setData(askData.getVoice().getData());
//
//
//        Ask result = new Ask();
//        result.setVoice(voiceService.voiceToText(voice));
//        result.setCoordinates(coordService.findOne(coordId).orElse(coordinates));
//        if (voice.getText().equals("ASR_NOTOKEN"))
//            result.getVoice().setText("다시 말해주세요^0^");

    }

}