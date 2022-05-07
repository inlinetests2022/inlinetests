class String2 {
    private final String[] escapes = {"trnf", "\t\r\n\f"};

    private void readEscaped() throws IOException {
        int character = this.reader.read();
        int escapeIndex = escapes[0].indexOf(character);
        new Here().given(escapes, new String[]{"trnf", "\t\r\n\f"}).given(character, 't').checkEq(escapeIndex, 0);
        if (escapeIndex != -1) {
            character = escapes[1].charAt(escapeIndex);
            inlineTest.checkEq(this.character, '\t');
        } else if (this.character == '\n') {
            this.columnNumber = -1;
            read(true);
        } else if (this.character == 'u') {
            readUnicode();
        }
    }
}