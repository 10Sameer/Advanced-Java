import java.beans.*;

public class ColorsBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            // Make sure Colors class is properly defined
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            return new PropertyDescriptor[]{rectangular};
        } catch (IntrospectionException e) {
            e.printStackTrace(); // Better for debugging
            return new PropertyDescriptor[0]; // Avoid returning null
        }
    }
}
