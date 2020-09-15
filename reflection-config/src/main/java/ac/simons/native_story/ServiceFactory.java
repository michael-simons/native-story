package ac.simons.native_story;

public class ServiceFactory {

	public Service getService() {
		Class<Service> aClass;
		try {
			aClass = (Class<Service>) Class.forName(ServiceImpl.class.getName());
			return aClass.getConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException("¯\\_(ツ)_/¯", e);
		}
	}
}
