import java.util.Iterator;

public class StudentGroupReverseIterator implements Iterator<Student> {

	private int lastIndex;
	private StudentGroup studentGroup;

	public StudentGroupReverseIterator(StudentGroup studentGroup) {
		this.lastIndex = studentGroup.getSize(); //позиция в конце
		this.studentGroup = studentGroup;
	}

	public int nextIndex() {
		return lastIndex; //возвращает текущий индекс
	}

	@Override
	public boolean hasNext() {
		return lastIndex > 0;
	}

	@Override
	public Student next() {
		return studentGroup.get(--lastIndex);
	}
}

