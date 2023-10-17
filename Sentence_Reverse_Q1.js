
function reverseWords(sentence) {
    let reversedSentence = '';
    let word = '';
    let inWord = false;

    for (let i = 0; i < sentence.length; i++) {
        const char = sentence[i];

        if (char === ' ' || i === sentence.length - 1) {
            if (i === sentence.length - 1) {
                word = word + char;
            }

            if (inWord) {
                for (let j = word.length - 1; j >= 0; j--) {
                    reversedSentence += word[j];
                }
                inWord = false;
                word = '';
            }

            reversedSentence += char;
        } else {
            inWord = true;
            word += char;
        }
    }

    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);

console.log("Reversed Sentence:", reversedSentence);

