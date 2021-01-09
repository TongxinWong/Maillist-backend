grammar Maillist;

maillist:   uMailBox (';' uMailBox)* ';'?;
uMailBox:   uLocal_part '@' uDomain ;
uLocal_part:    uDot_string ;
uDot_string:    uAtom ('.' uAtom)* ;
uAtom:  UCHARACTER
     |  UATOM
     ;
uDomain:    sub_udomain ('.' sub_udomain)+ ;
sub_udomain:    UCHARACTER
           |    SUBUDOMAIN
           ;

UCHARACTER: ULETDIG+ ;  //只有字母和数字
UATOM: ULETDIGUNDER+ ;  //用户名中可以出现数字，字母和下划线（gmail命名规则不允许出现下划线）
SUBUDOMAIN: ULETDIG ULDHSTR?;   //域名字符串规则，可以有连字符
fragment ULDHSTR:    ULETDIGHYPHEN* ULETDIG;
fragment ULETDIG:    [a-zA-Z0-9] ;  //字母数字
fragment ULETDIGUNDER:  [a-zA-Z0-9_] ;    //字母数字加下划线
fragment ULETDIGHYPHEN:  [a-zA-Z0-9-] ;    //字母数字加连字符
WS: [ \t\r\n]+ -> skip ;     //忽略空格