# Hangman-Basic
Osnovna verzija na zadacata Hangman

Да се напише програма која со која ќе се игра играта бесилка.
Од тастатура најпрвин се внесува кој збор ќе се погодува, потоа колку обиди се
дозволени за погодување пред да те “обесат”. Откога ќе се внесат овие две вредности,
потребно е да се испечатат 30 празни редови во конзола за да ги скриеме овие податоци
од играчот.
Откога ќе се внесат овие две вредности, на играчот му се прикажува зборот што треба да
го внесе маскиран со * и му се печати колку обиди има преостанато за да го погоди
зборот.
Покрај маскираниот збор и обидите, дополнително треба да се печати и кои букви до тој
момент биле изиграни.
Од тастатура играчот внесува букви се додека не го погоди зборот или не е “обесен”.
Кога играчот ќе внесе некоја буква, таа треба да се прикаже во изиграните букви и
доколку постои во зборот да се “отворат” од маскираниот збор сите позиции каде се
среќава таа буква. Ако буквата не постои, на играчот му се намалуваат бројот на
преостанати обиди. Ако буквата била изиграна до сега, независно дали таа постои или не
во зборот, не му се одземаат обиди на играчот.
Кога ќе стигне играчот до крајот на играта:
- Ако го погодил зборот, се испишува: “YOU WON!”
- Ако е обесен: се испишува “You lost, the word was: (зборот откриен)”, каде (зборот
откриен) е зборот без звездички што го погодувал.
На секоја внесена буква на играчот му се пишуваат сите детали за играта како што е
опишано во пасусот погоре:
Маскираниот збор со *, колку обиди преостануваат и кои букви поминале до сега.
