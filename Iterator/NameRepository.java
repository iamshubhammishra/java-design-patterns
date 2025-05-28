package Iterator;

public class NameRepository implements Collection<String> {
    private String[] names = {"Alice", "Bob", "Charlie"};

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return hasNext() ? names[index++] : null;
        }
    }
}
