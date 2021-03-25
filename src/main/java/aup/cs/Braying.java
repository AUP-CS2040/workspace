package aup.cs;

public interface Braying {
  int VOLUME = 8;

  String bray();
  default int adaptVolumn(boolean isNight) {
    if (isNight) {
      return (int)(VOLUME * 0.4);
    } else {
      return VOLUME;
    }
  }
}
