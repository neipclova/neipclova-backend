package neipclova.survey.controller;

import java.util.List;
import neipclova.survey.domain.Visitor;
import neipclova.survey.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import spring.Hwaxby_back.domain.Ask;
//import spring.Hwaxby_back.domain.Coordinates;
//import spring.Hwaxby_back.domain.Voice;
//import spring.Hwaxby_back.repository.CoordRepository;
//import spring.Hwaxby_back.repository.VoiceRepository;
//import spring.Hwaxby_back.service.CoordService;
//import spring.Hwaxby_back.service.MemberService;
//import spring.Hwaxby_back.service.VoiceService;

@RestController
@RequestMapping("/start")
public class StartController {

//    private final VoiceService voiceService;
//    private final CoordService coordService;
//
//    @Autowired
//    public AskController(VoiceService voiceService, CoordService coordService) {
//        this.voiceService = voiceService;
//        this.coordService = coordService;
//    }

//    @PostMapping("/start")
//    public ResponseEntity<?> getVisitorID(@RequestBody Visitor visitor) throws Exception {
//        Long visitor_id = visitor.getId();
//        String ip_address = visitor.getIp_address();
//        System.out.println("visitor_id : " + visitor_id);
//        System.out.println("ip_address : " + ip_address);
//        return new ResponseEntity<> (visitor_id, HttpStatus.OK);
////
////        Voice voice = new Voice();
////        voice.setData(askData.getVoice().getData());
////
////
////        Ask result = new Ask();
////        result.setVoice(voiceService.voiceToText(voice));
////        result.setCoordinates(coordService.findOne(coordId).orElse(coordinates));
////        if (voice.getText().equals("ASR_NOTOKEN"))
////            result.getVoice().setText("다시 말해주세요^0^");
//
//    }

    @Autowired
    private VisitorService visitorService;

    @RequestMapping(method = RequestMethod.POST)
    public Visitor addVisitor(@RequestBody Visitor visitor) {
        visitorService.addVisitor(visitor);
        Long visitor_id = visitor.getId();
        String ip_address = visitor.getIp_address();
        System.out.println("visitor_id : " + visitor_id);
        System.out.println("ip_address : " + ip_address);
        return visitor;
    }

//    @PostMapping("/start")
//    @ResponseBody
//    public String samplePostMapping() {
//        return "this is post mapping example";
//    }

}