package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class MainActivity<option4Btn, questionAttempted> extends AppCompatActivity {

    private TextView questionTV,getQuestionTV;
    private Button option1Btn,option2Btn,option3Btn;option4Btn;
    private ArrayList<QuizModal>quizModalArrayList;
    Random random;
    int CurrentScore = 0;
    private String option3;
    private String option1;
    private Object answer;
    private BreakIterator option4BtnBtn;
    questionAttempted = 1, currentPos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionTV = findViewById(R.id.idTVQuestionsAttempted);
        option1Btn = findViewById(R.idBtnOption1);
        option2Btn = findViewById(R.idBtnOption2);
        option3Btn = findViewById(R.idBtnOption3);
        option4Btn = findViewById(R.idBtnOption4);
        quizModalArrayList = new ArrayList<>();
        random = new Random();
        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size));
        setDateToView(currentPos);
        option1Btn.setOnClickListener( ){
            @Override
            public void onClick(View v) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase)
                    currentScore++;
            }
            questionAttempted++;
            currentPos = random.nextInt(quizModalArrayList.size());
            setDateToView(currentPos);
            }
        });

        option2Btn.setOnClickListener( ){
        @Override
        public void onClick(View v) {
            if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase)
            currentScore++;
        }
        questionAttempted++;
        currentPos = random.nextInt(quizModalArrayList.size());
        setDateToView(currentPos);
    }
});
        option3Btn.setOnClickListener( ){
        @Override
        public void onClick(View v) {
            if(quizModalArrayList.get(CurrentPos).getAnswer().trim.toLowercase().equal(option3Btn.getText().toString().trim().toLowerCase)
        }
        questionAttempted++;
        currentPos = random.nextInt(quizModalArrayList.size());
        setDateToView(currentPos);
        }

        option4Btn.setOnClickListener( ){
            @Override
             public void onClick(View v)
        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase)
        currentScore++;
        }
        questionAttempted++;
        currentPos = random.nextInt(quizModalArrayList.size());
        setDateToView(currentPos);
        }
        });



        }

        private void showButtomSheet(){
            BottomSheetDialog bottomsheetDialog = new BottomSheetDiaglog(Main.Activity.this);
            view bottomSheetView = LayoutInflater.from(getApplicationContext()).interface(R.layout.score_bottom_sheet, LinearLayout(findViewById(R.id.idscore));
            TextView scoreTV = bottomSheetVIew.findViewById(R.id.idTVScore)
            Button restartQuizBtn = bottomSheetView.findViewByid(R.id.idBtnRestart);



        }

    private void setDateToView(int currentPos){
        questionNumberTV.set.Text("Questions Attempted : "+questionAttempted + "/10");

        questionTV.setText(quizModalArrayList.get(currentPos).getQuestion());
        option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
        option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
        option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
        option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());

    });
}

    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {
        quizModalArrayList.add(new QuizModal( questionTV: "What famous 1968 Star Trek episode included a kiss between Captain Kirk and Uhura?", option1Btn: "Plato’s Stepchildren", option2Btn:"Katy Perry", option3Btn: "Princess Leia", option4Btn: "No one", answer:"Plato’s Stepchildren")
        quizModalArrayList.add(new QuizModal( questionTV: "What was the subject of the first-ever advertisement on TV?", option1Btn: "ATT", option2Btn:"Bulova Watches", option3Btn: "Super Bowl", option4Btn: "Tobacco ads ", answer:"Bulova Watches")
        quizModalArrayList.add(new QuizModal( questionTV: "Where did the Simpson family live?", option1Btn: "Springfield", option2Btn:"Mars", option3Btn: "LaLa Land", option4Btn: "None of the above", answer:"Springfield")
        quizModalArrayList.add(new QuizModal( questionTV: "What actress was never nude in any Sex and the City scenes?", option1Btn: "Samanatha", option2Btn:"Miranda", option3Btn: "Carrie", option4Btn: "Charoltte", answer:"Carrie")
        quizModalArrayList.add(new QuizModal( questionTV: "What season of Breaking Bad featured a flustered pizza toss by Walter?", option1Btn: "Season 1", option2Btn:"Season 2", option3Btn: "Season 3", option4Btn: "What toss?", answer:"Season 3")
        quizModalArrayList.add(new QuizModal( questionTV: "Where did Laverne & Shirley live?", option1Btn: "730 Hampton Street", option2Btn:"15 Main Street", option3Btn: "New York", option4Btn: "New Jersey", answer:"730 Hampton Street")
        quizModalArrayList.add(new QuizModal( questionTV: "How many episodes did Happy Days have?", option1Btn: "138", option2Btn:"300", option3Btn: "87", option4Btn: "255", answer:"255")
        quizModalArrayList.add(new QuizModal( questionTV: "What character on Friends often yells, “We were on a break”?", option1Btn: "Ross", option2Btn:"Joey", option3Btn: "Rachel", option4Btn: "Monica", answer:"Ross")
        quizModalArrayList.add(new QuizModal( questionTV: "Who wore fake teeth when filming Full House?", option1Btn: "Jessie", option2Btn:"Stephanie", option3Btn: "Michelle", option4Btn: "No one", answer:"Michelle")
        quizModalArrayList.add(new QuizModal( questionTV: "Where is Cheers set?", option1Btn: "Harlem", option2Btn:"Jersey Shore", option3Btn: "Boston", option4Btn: "Jamaica", answer:"Boston")
