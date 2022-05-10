public class MainFrame {
	private CPU cpu = new CPU();
	private HardDisk harddisk = new HardDisk();
	private Memory memory = new Memory();
	private OS os = new OS();
	
	public void on() {
		cpu.run();
		harddisk.read();
		memory.check();
		os.load();
	}
}
