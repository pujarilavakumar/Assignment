function reverseWords(sentence) {
    const words = sentence.split(/\s+/); // Split sentence into words
    const reversedWords = words.map(word => word.split('').reverse().join('')); // Reverse each word
    const reversedSentence = reversedWords.join(' '); // Join words back into a sentence
    return reversedSentence;
}

// Example usage
const input = "This is a sunny day";
const reversedSentence = reverseWords(input);
console.log("Reversed sentence:", reversedSentence);
