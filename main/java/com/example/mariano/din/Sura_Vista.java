package com.example.mariano.din;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mariano.din.adapters.VersiculoAdapter;
import com.example.mariano.din.modelo.Versiculo;

import java.util.ArrayList;

public class Sura_Vista extends AppCompatActivity {

    private ListView versiculos;
    private ArrayList<Versiculo> lista;
    private ArrayList<Versiculo> listafinal;
    private int [] aleyas={1,8,294,494,670,790,955,1161,1236,1365,1474,1597,1708,1751,1803,1902,2030,2141,2251,2349,
        2484,2596,2674,2792,2856,2933,3160,3253,3341,3410,
        3471,3504,3534,3607,3661,3706,3789,3971,4059,4134,
        4221,4273,4326,4415,4474,4511,4546,4584,4613,4631,4676,4736,4785,4847,4902,4980,5076,5105,5127,5151,
        5164,5178,5189,5200,5218,5230,5242,5272,5324,5376,5420,5448,5476,5496,5552,5592,5623,5673,5713,5759,
        5801,5830,5849,5885,5910,5932,5949,5968,5994,6024,
        6044,6059,6080,6091,6099,6107,6126,6131,6139,6147,
        6158,6169,6177,6180,6189,6194,6198,6205,6208,6214,
    6217,6222,6226,6231,6236};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura_vista);
        Bundle datos = this.getIntent().getExtras();
        int opcion = datos.getInt("opcion");

        String[] textotraducido = getResources().getStringArray(R.array.coranentero);
        String[] textooriginal = getResources().getStringArray(R.array.coranverdadero);
        String[] titulotranscripto = {"AlFātiḥa","AlBáqara","Ãl 'Imrān","AnNisā","AlMā'ida","AlAn'ām","Al'Arāf","AlAnfāl","AtTaūba","Yūnus",
                "Hūd","Yūsuf","ArRa'd","Ibrāhīm","AlḤiĵr","AnNaḥl","AlIsrā","AlKahf","Marīam","ṬāHā",
                "AlAnbiyā","AlHaĵĵ","AlMu'minūn","AnNūr","AlFurqān","AšŠu'arā","AnNaml","AlQáṣaṣ","Al'Ankabūt","ArRūm",
                "Luqmān","AsSaĵda","AlAḥzāb","Sabā","Fāṭir","YāSīn","AṣṢaffāt","Ṣād","AzZumar","Gāfir"
                ,"Fuṣṣilat","AšŠūrā","AzZujruf","AdDujān","AlĴāẕiya","AlAḥqāf","Muḥammad","AlFatḥ","AlḤuĵurāt","Qāf",
                "AdDāriyāt","AṭṬūr","AnNaĵm","AlQamar","ArRaḥmān","AlWāqi'a","AlḤadīd","AlMuĵādila","AlḤašr","AlMumtaḥana",
                "AṣSaff","AlĴumu'a","AlMunāfiqūn","AtTagābun","AṭṬalāq","AtTaḥrīm","AlMulk","AlQalam","AlḤāqa","AlMa'āriĵ",
                "Nūh","AlĴinn","AlMuzzammil","AlMuddaẕẕir","AlQiyāma","AlInsān","AlMursalāt","AnNabā","AnNāzi'āt","'Abasa",
                "AtTakūīr","AlInfiṭār","AlMuṭaffifīn","AlInšiqāq","AlBurūĵ","AṭṬāriq","AlA'lā","AlGāšiya","AlFaĵr","AlBalad",
                "AšŠams","AlLaīl","AdDuḥā","AšŠarḥ","AtTīn","Al'Alaq","AlQadr","AlBayina","AzZalzala","Al'Ādiyāt",
                "AlQāri'a","AtTakāẕur","Al'Asr","AlHumaza","AlFīl","Quraīš","AlMā'ūn","AlKaūẕar","AlKāfirūn","AnNaṣr",
                "AlMasad","AlIjlāṣ","AlFalaq","AnNās"};
        String[] tituloarabe = {"الفاتحة","البقرة","آل عمران","النساء","المائدة","الأنعام","الأعراف","الأنفال","التوبة","يونس",
                "هود","يوسف","الرعد","إبراهيم","الحجر","النحل","الإسراء","الكهف","مريم","طه",
                "الأنبياء","الحج","المؤمنون","النور","الفرقان","الشعراء","النمل","القصص","العنكبوت","الروم"
                ,"لقمان","السجدة","الأحزاب","سبأ","فاطر","يس","الصافات","ص","الزمر","غافر",
                "فصلت","الشورى","الزخرف","الدخان","الجاثية","الأحقاف","محمد","الفتح","الحجرات","ق",
                "الذاريات","الطور","النجم","القمر","الرحمن","الواقعة","الحديد","المجادلة","الحشر","الممتحنة",
                "الصف","الجمعة","المنافقون","التغابن","الطلاق","التحريم","الملك","القلم","الحاقة","المعارج",
                "نوح","الجن","المزمل","المدثر","القيامة","الإنسان","المرسلات","النبأ","النازعات","عبس",
                "التكوير","الإنفطار","المطففين","الإنشقاق","البروج","الطارق","الأعلى","الغاشية","الفجر","البلد",
                "الشمس","الليل","الضحى","الشرح","التين","العلق","القدر","البينة","الزلزلة","العاديات",
                "القارعة","التكاثر","العصر","الهمزة","الفيل","قريش","الماعون","الكوثر","الكافرون","النصر",
                "المسد","الإخلاص","الفلق","الناس"};
        String[] titulotrad = {"La Apertura","La Vaca","La Familia De Imrán","Las Mujeres","La Mesa Servida","Los Rebaños","Las Alturas","Los Botines","El Arrepentimiento","Jonás",
                "Hud","José","El Trueno","Abraham","El Tracto Rocoso","La Abeja","El Viaje Nocturno","La Caverna","María","Ta Ha",
                "Los Profetas","La Peregrinación","Los Creyentes","La Luz","El Discernimiento","Los Poetas","Las Hormigas","El Relato","La Araña","Los Romanos",
                "Luqmán","La Postración","Los Partidos","Saba","El Originador","Ya Sin","Los Formados En Filas","Sad","Los Grupos","Perdonador"
                ,"Explicadas Detalladamente","La Consulta","Los Adornos","El Humo","La Arrodillada","Las Dunas","Muhammad","La Victoria","Las Habitaciones Privadas","Qaf",
                "Los Vientos Arucanados","El Monte","La Estrella","La Luna","El Misericordioso","El Acontecimiento","El Hierro","La Discusión","El Destierro","La Examinada",
                "Las Filas","La Congregación","Los Hipócritas","El Desengaño Mutuo","El Divorcio","La Prohibición","El Reino","El Cálamo","Lo Inevitable","Las Estaciones Graduales",
                "Noé","El Genio","El Envuelto En Un Manto","El Arropado","El Levantamiento","El Hombre","Los Enviados","La Noticia","Los Que Arrancan","Frunció El Ceño",
                "El Enrollamiento","La Hendidura","Los Defraudadores","La Rotura","Las Constelaciones","El Que Viene En La Noche","El Altísimo","La Que Cubre","El Alba","El País",
                "El Sol","La Noche","La Mañana","La Abertura","El Higo","El Cigoto","El Decreto","La Evidencia","El Terremoto","Los Que Galopan",
                "La Catástrofe","La Rivalidad","El Tiempo","El Difamador","El Elefante","Quraish","La Ayuda","La Abundancia","Los Incrédulos","El Auxilio",
                "El Esparto","La Sinceridad","La Aurora","Los Hombres"};

        TextView titulooriginal = (TextView)findViewById(R.id.tituloriginal);
        titulooriginal.setText(tituloarabe[opcion]);

        TextView titulotrans = (TextView)findViewById(R.id.titulotrans);
        titulotrans.setText(titulotranscripto[opcion]);

        TextView titulotraducido = (TextView)findViewById(R.id.titulotrad);
        titulotraducido.setText(titulotrad[opcion]);

        int versiculoinicial=aleyas[opcion];
        int largo = aleyas[opcion+1]-aleyas[opcion];
        lista = new ArrayList<>();
        listafinal = new ArrayList<>();

        for(int i=versiculoinicial;i<(largo+versiculoinicial);i++){
            lista.add(new Versiculo(i,textotraducido[i-1],textooriginal[i-1]));
        }

        int versiculoreal=0;
        for(Versiculo vers: lista){
            versiculoreal++; String textTrad=vers.getTextoes(); String textarab=vers.getTextoar();
            listafinal.add(new Versiculo(versiculoreal,textTrad,textarab));
        }

        VersiculoAdapter adapter = new VersiculoAdapter(this, listafinal);
        versiculos = (ListView) findViewById(R.id.versiculos);

        versiculos.setAdapter(adapter);




    }

    }







