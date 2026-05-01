package stack_queue;

public class DynamicStack extends Internalimpstack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int element) {
        if (ptr == data.length - 1) {
            int temp[] = new int[2 * data.length];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(element);
    }
}
